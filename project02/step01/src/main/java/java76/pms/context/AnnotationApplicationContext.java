/*
 * @Component애노테이션이 붙은 클래스를 찾기 위해
 * 오픈 소스를 사용한다.
 * => Reflections 라이브러리 도입
 */
package java76.pms.context;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Method;
import java.util.HashMap;

import org.reflections.Reflections;

import java76.pms.annotation.Component;

public class AnnotationApplicationContext {
  HashMap<String,Object> objMap = new HashMap<String,Object>();

  public AnnotationApplicationContext(String basePackage) throws Exception {
    createObjects(basePackage);
    injectDepencies();
  }

  public Object getBean(String name) {
    return objMap.get(name);
  }

  private void createObjects(String packageName) throws Exception {
    Reflections reflections = new Reflections(packageName);

    Component anno = null;
    String objKey = null;

    for (Class<?> clazz : reflections.getTypesAnnotatedWith(
                                           Component.class)) {
      anno = clazz.getAnnotation(Component.class);
      if (anno == null)
        continue;
      objKey = anno.value();

      if (objKey.length() == 0) {
        objKey = clazz.getName();
      }

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
