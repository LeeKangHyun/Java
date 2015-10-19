package step13.ex04;

public class Test01 {

  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("00000");
    list.add("11111");
    list.add("22222");
    list.add("33333");
    list.add("44444");
    list.add("55555");
    
    AbstractIterator iterator = list.iterator("reverse");
    
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}