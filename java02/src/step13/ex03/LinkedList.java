package step13.ex03;

public class LinkedList {
  // Bucket 클래스는 LinkedList에서만 사용하는 클래스이기 때문에,
  // 이런 경우 중첩 클래스로 정의하는 것이 가장 바람직하다.
  private class Bucket {
    
    protected Object value;
    protected Bucket next;

    public Bucket() { }

    public Bucket(Object value) {
      this.value = value;
    }

    public Bucket(Object value, Bucket next) {
      this(value);
      this.next = next;
    }

    public Object getValue() {
      return value;
    }

    public void setValue(Object value) {
      this.value = value;
    }

    public Bucket getNext() {
      return next;
    }

    public void setNext(Bucket next) {
      this.next = next;
    }

  }
  
  private Bucket start;
  private Bucket end;
  private int length;
  
  public LinkedList() {
    start = new Bucket();
    end = start;
  }

  public int add(Object value) {
    // 1. end가 가리키는 곳에 value
    end.setValue(value);
    // 2. 버킷을 새로 만들고 기존 버킷과 연결
    end.setNext(new Bucket());
    // 3. end는 새 버킷을 가리킨다.
    end = end.getNext();
    // 4. length증가
    length++;
    return 0;
  }

  public Object get(int index) {
    // 0. index가 0보다 작거나 length보다 크거나 같다면 null을 리턴한다.
    if (index < 0 || length <= index)
      return null;

    // 1. start 버킷에서 시작하여 index가 가리키는 버킷까지 이동한다.
    int pos = 0;
    Bucket cursor = start;

    while (pos < index) {
      cursor = cursor.getNext();
      pos++;
    }

    // 2. 찾은 버킷에 들어있는 값을 리턴한다.
    return cursor.getValue();

  }

  public Object remove(int index) {
    if (index < 0 || length <= index)
      return null;
    Object removedValue = null;
    length--;

    if (index == 0) {
      removedValue = start.getValue();
      start = start.getNext();
      return removedValue;
    }

    int pos = 0;
    Bucket cursor1 = start;

    while (pos < (index - 1)) {
      cursor1 = cursor1.getNext();
      pos++;
    }

    removedValue = cursor1.getNext().getValue();
    cursor1.setNext(cursor1.getNext().getNext());

    return removedValue;
  }

  public int size() {
    return length;
  }

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("00000");
    list.add("11111");
    list.add("22222");
    list.add("33333");
    list.add("44444");
    list.add("55555");

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    System.out.println("----------------");

    System.out.println(list.remove(2));
    System.out.println("----------------");

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
    System.out.println("----------------");

    list.add("66666");
    list.remove(0);
    System.out.println("----------------");

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    list.remove(4);
    System.out.println("----------------");

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}









