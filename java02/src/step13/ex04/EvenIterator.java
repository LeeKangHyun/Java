package step13.ex04;

public class EvenIterator extends AbstractIterator {
  LinkedList list;
  int cursor;

  public EvenIterator(LinkedList list) {
    this.list = list;
  }
  
  public boolean hasNext() {
    if (cursor < list.size())  
      return true;
    return false;
  }

  public Object next() {
    int i = cursor;
    cursor += 2;
    return list.get(i);
  }
}
