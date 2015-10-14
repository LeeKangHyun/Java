package step10.ex03;

public class Queue {
  Bucket front;
  Bucket rear;
  int length;
  
  public Queue() {
    front = new Bucket();
    rear = front;
  }
  
  public int put(Object value) {
    rear.setValue(value);
    rear.setNext(new Bucket());
    rear = rear.getNext();
    length++;
    
    return 0;
  }
  
  public Object get() {
    if (length == 0) 
      return null;
    
    Object Value = front.getValue();
    front = front.getNext();
    length--;
    
    return Value; 
  }
  
  public int size() {
    return length;
  }
  
  public static void main (String[] args) {
    Queue queue = new Queue();
    
    queue.put("00000");
    queue.put("11111");
    queue.put("22222");
    queue.put("33333");
    queue.put("44444");
    
    int len = queue.size();
    
    for (int i = 0; i <= len; i++) {
      System.out.println(queue.get());
    }
  }
}









