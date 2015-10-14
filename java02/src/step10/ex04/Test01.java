/*
 * 주제: 해시맵 사용하기
 * - 저장할 때 키를 사용한다.
 *   => 저장 순서에 영향을 받지 않는다.
 */
package step10.ex04;

import java.util.HashMap;

public class Test01 {

  public static void main(String[] args) {
    HashMap map = new HashMap();
    
    //put(key, value);
    //key - 반드시 자바 객체여야 한다. primitive type을 사용할 수 없따.
    //value - 반드시 자바 객체여야 한다.
    map.put(1, "홍길동");  // 1이 키로 사용되는 것이 아니라, 1읠 Integer객체가 사용된다.
    map.put(2, "임꺽정");
    map.put(3, "김원봉");
    
    System.out.println(map.get(3));
    System.out.println(map.get(2));
    System.out.println(map.get(1));
    System.out.println("----------------");
    
    // LinkedList와 같다! 차이가 뭐야"?
    // => 숫자가 아닌 문자열을 사용할 수 있다.
    
    HashMap map2 = new HashMap();
    map2.put("aaa", "홍길동");
    map2.put("bbb", "임꺽정");
    map2.put("ccc", "안중근");
    
    System.out.println(map2.get("bbb"));
    System.out.println(map2.get("ccc"));
    System.out.println(map2.get("aaa"));
    System.out.println("----------------");
    
    //또한, 랩퍼나 String이 아닌 다른 자바 객체를 키로 사용할 수 있다.
  }

}
