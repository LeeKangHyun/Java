package step13.ex04;

public class ReverseIterator extends AbstractIterator {
  LinkedList list;
  int cursor;

  public ReverseIterator(LinkedList list) {
    this.list = list;
    cursor = list.size() - 1;
  }
  
  public boolean hasNext() {
    if (cursor >= 0)  
      return true;
    return false;
  }

  public Object next() {
    return list.get(cursor--);
  }
}
