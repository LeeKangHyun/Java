package step13.ex04;

public class LinkedList {
  // Bucket 클래스는 LinkedList에서만 사용하는 클래스이기 때문에,
  // 이런 경우 중첩 클래스로 정의하는 것이 가장 바람직하다.
  // => static으로 선언된 이너 클래스는 스태틱 메서드처럼 this변수가 없다.
  //    바깥 클래스의 인스턴스 변수나 메서드에 접근할 수 없다.
  private static class Bucket {
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

  // Member Inner Class
  // => 일반적인 메서드와 동일하게 바깥 클래스의 인스턴스 변수나 인스턴스 메서드를 사용할 수 있다.
  private Bucket start;
  private Bucket end;
  private int length;

  public LinkedList() {
    start = new Bucket();
    end = start;
  }

  public int add(Object value) {
    end.setValue(value);
    end.setNext(new Bucket());
    end = end.getNext();
    length++;
    return 0;
  }

  public Object get(int index) {
    if (index < 0 || length <= index)
      return null;

    int pos = 0;
    Bucket cursor = start;

    while (pos < index) {
      cursor = cursor.getNext();
      pos++;
    }

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
  
  public AbstractIterator iterator(String type) {
    if (type.equals("even")) {
      return new EvenIterator(this);
    } else {
      return new ReverseIterator(this);
    }
  }
}









