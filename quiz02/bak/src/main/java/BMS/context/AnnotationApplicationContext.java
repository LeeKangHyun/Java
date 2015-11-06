package BMS.context;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Method;
import java.util.HashMap;

import org.reflections.Reflections;

import BMS.annotation.Component;

public class AnnotationApplicationContext {
  HashMap<String,Object> objMap = new HashMap<String,Object>();
  
  public AnnotationApplicationContext(String basePackage) throws Exception {
    createObjects(basePackage);
    injectDependencies();
  }
  
  public Object getBean(String name) {
    return objMap.get(name);
  }
  
  public void addBean(String name, Object obj) throws Exception {
    objMap.put(name, obj);
    injectDependencies();
  }
  
  private void createObjects(String packageName) throws Exception {
    Reflections reflections = new Reflections(packageName);
    
    Component anno = null;
    String objKey = null;
    
    for (Class<?> clazz : reflections.getTypesAnnotatedWith(
                                            Component.class)) {
      anno = clazz.getAnnotation(Component.class);
      if (anno == null) // @Component 애노테이션 없으면 다음 항목으로 간다.
        continue;
      
      objKey = anno.value();
      
      if (objKey.length() == 0) {
        objKey = clazz.getName();
      }
      
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
