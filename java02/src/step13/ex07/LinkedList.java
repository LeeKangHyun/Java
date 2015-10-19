package step13.ex07;

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

  // 멤버 이너 인터페이스
  public interface Iterator {
    boolean hasNext();
    Object next();
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
  
  public  Iterator iterator(String type) {
    if (type.equals("even")) {
      return new Iterator() {
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
    } else {
      return new Iterator() {
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
    }
  }
}









