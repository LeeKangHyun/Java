package v01;

// 1) 클래스 이름 뒤에 어떤 타입을 다룰 지 별명(예:E, T, V 등)을 선언한다.
// 2) 그 타입을 사용하는 곳에 별명 문자로 대체한다.
public class LinkedList<E> {
  private Bucket<E> start;
  private Bucket<E> end;
  private int length;
  
  public LinkedList() {
    start = new Bucket<E>();
    end = start;
  }
  
  public int add(E value) {
    end.setValue(value);
    end.setNext(new Bucket<E>());
    end = end.getNext();
    length++;
    return 0;
  }
  
  public E get(int index) {
    if (index < 0 || index >= length)
      return null;
    
    int pos = 0;
    Bucket<E> cursor = start;
    
    while (pos < index) {
      cursor = cursor.getNext();
      pos++;
    }
    
    return cursor.getValue();
  }
  
  public E remove(int index) {
    if (index < 0 || index >= length)
      return null;
    
    E removedValue = null;
    length--;
    
    if (index == 0) {
      removedValue = start.getValue();
      start = start.getNext();
      return removedValue;
    }
    
    int pos = 0;
    Bucket<E> cursor = start;
    while (pos < index-1) {
      cursor = cursor.getNext();
      pos++;
    }
    
    removedValue = cursor.getNext().getValue();
    cursor.setNext(cursor.getNext().getNext());
    
    return removedValue;
  }
  
  public int size() {
    return length;
  }
  
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    list.add("00000");
    list.add("11111");
    list.add("22222");
    list.add("33333");
    list.add("44444");
    list.add("55555");
    //list.add(100); // 다른 타입의 값을 저장하면 오류 발생!
    
    String item;
    for (int i = 0; i < list.size(); i++) {
      item = /*(String)*/ list.get(i); // 제네릭을 적용하면 타입 캐스팅 할 필요가 없다.
      System.out.println(item);
    }
    
  }
}







