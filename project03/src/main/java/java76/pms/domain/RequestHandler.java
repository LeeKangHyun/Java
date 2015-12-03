package java76.pms.domain;

import java.lang.reflect.Method;

public class RequestHandler {
  protected Object instance;
  protected Method method;
  
  public RequestHandler() {}
  
  public RequestHandler(Object instance, Method method) {
    this.instance = instance;
    this.method = method;
  }
  
  public Object getInstance() {
    return instance;
  }
  public void setInstance(Object instance) {
    this.instance = instance;
  }
  public Method getMethod() {
    return method;
  }
  public void setMethod(Method method) {
    this.method = method;
  }
}
