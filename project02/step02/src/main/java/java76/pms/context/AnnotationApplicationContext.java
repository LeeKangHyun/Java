/*
 * @Component 애노테이션이 붙은 클래스를 찾기 위해 
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
    injectDependencies();
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
      // 클래스에서 @Component 애노테이션을 추출한다.
      anno = clazz.getAnnotation(Component.class);
      if (anno == null) // @Component 애노테이션 없으면 다음 항목으로 간다.
        continue;
      
      // @Component 애노테이션에서 value 값을 추출한다.
      // value 값은 객체를 저장할 때 key로 사용할 것이다.
      objKey = anno.value();
      
      // 만약 value 값이 빈 문자열이면, 클래스 이름을 key로 사용한다. 
      if (objKey.length() == 0) {
        objKey = clazz.getName();
      }
      
      // 애노테이션에 등록된 객체 이름으로 해당 클래스의 인스턴스를 만들어 맵에 저장한다.
      objMap.put(objKey, clazz.newInstance());
    }
  }
  
  private void injectDependencies() throws Exception {
    Object[] objList = objMap.values().toArray();
    Object dependency = null;
    
    for (Object obj : objList) {
      for (Method m : obj.getClass().getMethods()) {
        if (!isSetter(m)) continue;
        dependency = findObjectByType(m.getParameterTypes()[0]);
        if (dependency == null) continue;
        m.invoke(obj, dependency);
      }
    }
  }
  
  private boolean isSetter(Method m) {
    if (m.getName().startsWith("set") 
        && m.getParameterTypes().length == 1)
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
