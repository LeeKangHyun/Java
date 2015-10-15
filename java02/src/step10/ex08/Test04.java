package step10.ex08;

import java.util.ArrayList;

public class Test04 {
  // ArrayList로 부터 인덱스가 짝수인 항목의 값을 꺼내주는 클래스
  static class Iterator {
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
  // ArrayList에서 값을 꺼낼때 뒤에서 부터 꺼내주는 클래스
  static class Iterator2 {
    ArrayList list;
    int cursor;

    public Iterator2(ArrayList list) {
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
  // ArrayList에서 값을 꺼낼때 앞에서 부터 꺼내주는 클래스
  static class Iterator3 {
    ArrayList list;
    int cursor;

    public Iterator3(ArrayList list) {
      this.list = list;
    }

    public boolean hasNext() {
      if (cursor < list.size())
        return true;
      return false;
    }

    public Object next() {
      return list.get(cursor++);
    }
  }

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("홍길동0");
    list.add("홍길동1");
    list.add("홍길동2");
    list.add("홍길동3");
    list.add("홍길동4");
    list.add("홍길동5");
    
    // 인덱스가 짝수인 항목의 값을 꺼내기
    Iterator iterator = new Iterator(list);
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    System.out.println("----------------");
      
    // 뒤에서 부터 항목의 값을 꺼내기
    Iterator2 iterator2 = new Iterator2(list);
    while (iterator2.hasNext()) {
      System.out.println(iterator2.next());
    }
    System.out.println("----------------");
    
    // 앞에서 부터 항목의 값을 꺼내기
    Iterator3 iterator3 = new Iterator3(list);
    while (iterator3.hasNext()) {
      System.out.println(iterator3.next());
    }
    System.out.println("----------------");
    
    // 결론!
    // - 목록에서 값을 꺼내는 방법이 다르더라도, 드는 같다.
  }
}











