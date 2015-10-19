package step13.ex07;

public class Test01 {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("00000");
    list.add("11111");
    list.add("22222");
    list.add("33333");
    list.add("44444");
    list.add("55555");
    
    // Iterator 인터페이스를 규칙에 따라 작성한 클래스의 인스턴스
    // => "Iterator 구현체"라 부른다.
    LinkedList.Iterator iterator = list.iterator("reverse");
    
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}