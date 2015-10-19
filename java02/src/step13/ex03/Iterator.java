package step13.ex03;

import java.util.ArrayList;

public class Iterator {
  ArrayList list;
  int cursor;

  public Iterator(ArrayList list) {
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
