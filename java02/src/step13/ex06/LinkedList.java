package step13.ex06;

public class LinkedList {
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

  public abstract class AbstractIterator {
    public abstract boolean hasNext();
    public abstract Object next();
  }  

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
  public  AbstractIterator iterator(String type) {
    // 익명 이너 클래스 만들기
    // 1) 클래스 이름이 없기 때문에 따로 인스턴스를 생성할 수 없다.
    //    => 클래스를 정의하는 문법에 인스턴스를 생성하는 문법을 결합해야 한다.
    //    => 클래스 정의 앞에 new를 붙인다.
    //    => 클래스 이름이 없기 때문에 class 명령을 생략한다.
    //    => 혹시 슈퍼 클래스를 상속 받거나 인터페이스를 구현한다면,
    //       extends 또는 implements 명령을 생략한다.
    //    => 익명 클래스는 생성자를 가질 수 없다. => 슈퍼 클래스의 생성자를 호출한다.
    // 2) 클래스 이름이 없기 때문에 생성자를 만들 수 없다.
    //    => 별도의 값을 초기화 메서드를 선언해야 한다.
    //
    // 3) 로컬 이너 클래스도 바깥 클래스의 인스턴스 멤버를 접근할 수 있다.
    //    => 바깥클래스명.this.멤버이름
    //    => 예) LinkedList.this.size()
    //
    // 4) 클래스를 정의하는 동시에 인스턴스를 생성하기 때문에, 인스턴스 주소를 바로 받아야 한다.
    //    => 익명 클래스는 이름이 없기 때문에 레퍼런스 변수를 선언할 수 없다.
    //    => 슈퍼 클래스의 레퍼런스를 선언하면 된다.
    //
    AbstractIterator evenIterator = new /*class ~~ extends */ AbstractIterator() {
      int cursor;

      public boolean hasNext() {
        if (cursor < LinkedList.this.size())  
          return true;
        return false;
      }

      public Object next() {
        int i = cursor;
        cursor += 2;
        return LinkedList.this.get(i);
      }
    };
    
    AbstractIterator reverseIterator = new AbstractIterator() {
      int cursor;

      { // 인스턴스 블록
        cursor = LinkedList.this.size() - 1;
      }
      
      public boolean hasNext() {
        if (cursor >= 0)  
          return true;
        return false;
      }

      public Object next() {
        return LinkedList.this.get(cursor--);
      }
    };
    
    if (type.equals("even")) {
      return evenIterator;
    } else {
      return reverseIterator;
    }
  }
}









