/* 
 * 주제: 해시맵 사용하기 4
 * - MyKey의 내용이 같으면 해시코드가 같고, equals()의 리턴값이 true가 되게하라.
 */
package step10.ex04;

import java.util.HashMap;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Test04 {

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

    // Object로부터 상속 받은 hashCode()는
    // 인스턴스 마다 고유의 해시 값을 리턴한다.
    //
    // 그러나 HashMap의 키로 사용하려면,
    // 서로 다른 인스턴스라도 같은 데이터를 갖고 있다면, 같은 해시 값을 리턴해야 한다.
    // 또한 equals()의 결과는 true여야 한다.
    // => hasCode()와 equals()를 오버라이딩 하라!
    // => 기존의 Wrapper 클래스와 String클래스는 이 메서드들을 오버라이딩 했다.
    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((id == null) ? 0 : id.hashCode());
      result = prime * result + secNo;
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      MyKey other = (MyKey) obj;
      if (id == null) {
        if (other.id != null)
          return false;
      } else if (!id.equals(other.id))
        return false;
      if (secNo != other.secNo)
        return false;
      return true;
    }

  }
  public static void main(String[] args) {
    MyKey mk1 = new MyKey("aaa", 10);
    MyKey mk2 = new MyKey("bbb", 20);
    MyKey mk3 = new MyKey("ccc", 30);
    MyKey mk4 = new MyKey("bbb", 20);

    HashMap map2 = new HashMap();
    map2.put(mk1, "떡볶이");
    map2.put(mk2, "족발");
    map2.put(mk3, "보쌈");

    System.out.println(map2.get(mk1));
    System.out.println(map2.get(mk2));
    System.out.println(map2.get(mk3));
    System.out.println(map2.get(mk4));
    System.out.println("----------------");

    System.out.println(mk1.hashCode());
    System.out.println(mk2.hashCode());
    System.out.println(mk3.hashCode());
    System.out.println(mk4.hashCode());
    if (mk1 == mk2) {
      System.out.println("mk1 == mk2");
    }
    
    if (mk2.equals(mk4))
      System.out.println("mk2.equals(mk4)");
  }
}









