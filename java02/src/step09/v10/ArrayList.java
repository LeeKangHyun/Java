/*
 * 역할: 객체의 목록을 다룬다.
 */
package step09.v10;

public class ArrayList {
  private Object[] objList = new Object[1000];
  int pos;
  
  public int add(Object obj) {
    if (pos < objList.length) {
      objList[pos++] = obj;
      return 0;
    }
    return -1;
  }
  
  public Object get(int index) {
    if (index < 0 || index >= pos)
      return null;
    return objList[index];
  }
  
  public Object remove(int index) {
    if (index < 0 || index >= pos)
      return null;
    
    Object removedObj = objList[index];
    
    for(int i = index; i < (pos-1); i++) {
      objList[i] = objList[i+1];
    }
    pos--;
    
    return removedObj;
  }
  
  public int size() {
    return pos;
  }
}









