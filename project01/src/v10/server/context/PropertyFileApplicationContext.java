package v10.server.context;

import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Properties;
import java.util.Map.Entry;

public class PropertyFileApplicationContext {
  HashMap<String,Object> objMap = new HashMap<String,Object>();
  
  public PropertyFileApplicationContext(String path) throws Exception {
    creadteObjects(path);
    injectDepencies();
  }
  
  public Object getBean(String name) {
    return objMap.get(name);
  }
  
  private void creadteObjects(String propPath) throws Exception {
    Properties props = new Properties();
    props.load(new FileReader(propPath));

    Class<?> clazz = null;
    for (Entry<Object,Object> entry : props.entrySet()) {
      clazz = Class.forName((String)entry.getValue());
      objMap.put((String)entry.getKey(), clazz.newInstance());
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
  
  
}
