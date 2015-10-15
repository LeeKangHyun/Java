package step10.ex08;

import java.util.HashSet;
import java.util.Iterator;

public class Test05 {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<String>();
    set.add("홍길동");
    set.add("임꺽정");
    set.add("유관순");
    set.add("홍길동"); 
    
    // Iterator: 목록에서 자신만의 방식을 사용하여 값을 꺼내주는 객체
    Iterator<String> iterator = set.iterator();
    
    // 개발자는 꺼내는 방식에 상관없이 일관된 방법으로 값을 꺼낼 수 있다.
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
