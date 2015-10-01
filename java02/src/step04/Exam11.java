/* 
 * 주제: gabage & gabage collector
 */
package step04;

public class Exam11 {

  static class Score {
    String name;
    int[] subjects = new int[5];
    int sum;
    float aver;
  }

  public static void main(String[] args) {
    Score v1 = new Score();
    Score v2 = new Score();
    Score v3 = v1;
    v2 = v1;  // v2가 가리키던 인스턴스의 주소는 잃어버린다.
    // 즉 사용할 수 없는 인스턴스가 된다. => "garbage"

    // garbage? == dangling object
    // - 참조하는 레퍼런스가 단 한 개도 존재하지 않는 인스턴스를 말한다.
    // - 즉 사용할 수 없는 상대, => 그냥 메모리만 점유 => 낭비되고 욌는 상태.
    // - JVM은 다음의 규"garbage collector"를 통해서 다음 규칙에 따라 가비지를 제거한다.
    //   => 다시 그 메모리를 사용할 수 있는 상태로 만든다.
    //   1) 메모리가 부족할 때,
    //   2) CPU가 한가할 때(idle time) 


    /* 참고: dangling pointer?
     * - 무효한 인스턴스를 가리키는 경우,
     */
    /*char* p;
    p = (char*)malloc(100)
        p[0] = 'a';
    p[99] = 'z';
    free(p);
    p[1] = 'b'; // p는 무효한 주소를 가리키기 때문에 "dangling pointer"이다.
    */
  }
}




