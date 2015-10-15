package step10.ex06;

import java.util.ArrayList;

public class Test01 {
  public static void main(String[] args) {
    // 제네릭 사용 전
    // - 어떤 타입의 객체를 저장할 지 지정하지 않았기 때문에,
    //   아무 객체나 저장할 수 있다.
    
    ArrayList list = new ArrayList();
    list.add(new Integer(10));
    list.add("홍길동");
    list.add(true);
    
    // - 단점: 꺼낼 때 어떤 타입인지 타입 캐스팅 해야 한다.
    Integer v1 = (Integer)list.get(0);
    String v2 = (String)list.get(1);
    Boolean v3 = (Boolean)list.get(2);
    
    // 제네릭 사용 후
    // - 어떤 타입의 객체를 저장할 지 지정한다.
    ArrayList<String> list2 = new ArrayList<String>();
    //list2.add(new Integer(10)); // 오류! 다른 타입의 객체는 저장할 수 없다.
    list2.add("홍길동");
    //list2.add(true);  // 오류!
    list2.add("임꺽정");
    
    // - 이점: 타입 캐스팅 할 필요가 없다. 코드가 단순해 진다.
    String s1 = list2.get(0);
    String s2 = list2.get(1);
  }
}
