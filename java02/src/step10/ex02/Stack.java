package step10.ex02;

public class Stack {
  private Object[] list = new Object[100];
  int pos;
  
  public int push(Object value) { // 값을 맨 마지막에 넣는다.
    if (pos == list.length)
      return -1;
    list[pos++] = value;
    return 0;
  }
  
  public Object pop() { // 맨 마지막 값을 꺼낸다.(제거한다.)
    if (pos == 0)
      return null;
    return list[--pos];
  }
  
  public Object get() { // 맨 마지막 값을 꺼낸다.(제거하지 않는다)
    if (pos == 0)
      return null;
    return list[pos-1];
  }
  
  public int size() {
    return pos;
  }
  public static void main(String[] args) {
    Stack stack = new Stack();
    
    stack.push("0000");
    stack.push("1111");
    stack.push("2222");
    stack.push("3333");
    stack.push("4444");
    
    int len = stack.size();
    for (int i = 0; i < len; i++) {
      System.out.println(stack.pop());
    }
  }
}









