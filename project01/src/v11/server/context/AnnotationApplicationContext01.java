/*
 * 직접 디렉토리를 뒤져서 @Component가 붙은
 * 클래스를 찾아 인스턴스를 생성한다.
 */
package v11.server.context;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Method;
import java.util.HashMap;

import v11.server.annotation.Component;

public class AnnotationApplicationContext01 {
  HashMap<String,Object> objMap = new HashMap<String,Object>();

  public AnnotationApplicationContext01(String basePackage) throws Exception {
    createObjects(basePackage, new File("./bin/" + basePackage.replace(".", "/")));
    injectDepencies();
  }

  public Object getBean(String name) {
    return objMap.get(name);
  }

  private void createObjects(String packageName, File file) throws Exception {
    File[] subFiles = file.listFiles(new DirectoryOrClassFilter());

    Class<?> clazz = null;
    Component anno = null;
    String objKey = null;

    for (File f : subFiles) {
      if (f.isDirectory()) {
        createObjects(packageName + "." + f.getName(), f);
        continue;
      }
      // 클래스 파일을 로딩한
      clazz = Class.forName(packageName + "." + 
          f.getName().replace(".class", ""));
      // 클래스에서 @Component 애노테이션을 추출한다.
      anno = clazz.getAnnotation(Component.class);
      if (anno == null) // @Component 애노테이션 없으면 다음 항목으로 간다.
        continue;
      // @Component 애노테이션에서 value값을 추출한다.
      // value값은 객체를 저장할 때 key로 사용할 것이다.
      objKey = anno.value();

      // 만약 value값이 빈 문자열이면, 클래스 이름을 key로 한다.
      if (objKey.length() == 0) {
        objKey = clazz.getName();
      }

      // 애노테이션에 등록된 객체 이름으로 해당 클래스의 인스턴스를 만들어 맵에 저장한다.
      objMap.put(objKey, clazz.newInstance());
    }
  }

  private void injectDepencies() throws Exception {
    Object[] objList = objMap.values().toArray();
    Object dependency = null;

    for (Object obj : objList) {
      for (Method m : obj.getClass().getMethods()) {
        if (!isSetter(m)) continue;
        dependency = findObjectByType(m.getParameterTypes()[0]); 
        if (dependency == null ) continue;
        m.invoke(obj, dependency);
      }
    }
  }

  private boolean isSetter(Method m) {
    if (m.getName().startsWith("set")
        && m.getParameterTypes().length ==1)
      return true;
    return false;
  }

  private Object findObjectByType(Class<?> type) {
    Object[] objList = objMap.values().toArray();

    for (Object obj : objList) {
      if (type.isInstance(obj))
        return obj;
    }
    return null;
  }

  class DirectoryOrClassFilter implements FileFilter {
    public boolean accept(File pathname) {
      if (pathname.isDirectory())
        return true;

      if (pathname.getName().endsWith(".class"))
        return true;

      return false;
    }
  }
}
