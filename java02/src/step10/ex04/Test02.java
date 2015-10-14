/* 
 * 주제: 
 */
package step10.ex04;

import java.util.HashMap;

public class Test02 {

  static class MyKey {
    String id;
    int secNo;
    
    public MyKey(String id, int secNo) {
      this.id = id;
      this.secNo = secNo;
    }

    @Override
    public String toString() {
      return "MyKey [id=" + id + ", secNo=" + secNo + "]";
    }
  }
  public static void main(String[] args) {
    String key1 = new String("aaa");
    String key2 = new String("bbb");
    String key3 = new String("ccc");

    HashMap map = new HashMap();
    map.put(key1, "홍길동");  // 1이 키로 사용되는 것이 아니라, 1읠 Integer객체가 사용된다.
    map.put(key2, "임꺽정");
    map.put(key3, "김원봉");

    System.out.println(map.get(key2));
    
    String key4 = new String("bbb");
    System.out.println(map.get(key4));

    System.out.println("----------------");
    
    //MyKey를 사용할 경우,
    MyKey mk1 = new MyKey("aaa", 10);
    MyKey mk2 = new MyKey("bbb", 20);
    MyKey mk3 = new MyKey("ccc", 30);
    
    HashMap map2 = new HashMap();
    map2.put(mk1, "떡볶이");
    map2.put(mk2, "족발");
    map2.put(mk3, "보쌈");
    
   System.out.println(map2.get(mk2));
   
   MyKey mk4 = new MyKey("bbb", 20);
   System.out.println(map2.get(mk4)); // null. 이유는?
   System.out.println("----------------");
   
   // HashMap은 값을 저장할 때 키의 해시코드 값을 사용하여
   // 특정 위치에 값을 저장한다.
   // 값을 꺼낼 때도 키의 해시코드를 사용하여 값을 찾는다.
   
   // String 클래스의 키 해시코드 값?
   System.out.println(key1.hashCode());
   System.out.println(key2.hashCode());
   System.out.println(key3.hashCode());
   System.out.println(key4.hashCode());
   System.out.println("----------------");
   
   // MyKey 클래스의 키 해시코드 값?
   System.out.println(mk1.hashCode());
   System.out.println(mk2.hashCode());
   System.out.println(mk3.hashCode());
   System.out.println(mk4.hashCode());
   System.out.println("----------------");
  }

}









