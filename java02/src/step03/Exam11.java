/*
 * 주제: 블록과 변수의 범위 - for문의 로컬변
 */
package step03;

public class Exam11 {
  
  public static void main(String[] args) {
    // 1) for문 밖에 로컬 변수를 선언한다.
    int i;
    for (i = 0; i < 5; i++)
      System.out.println(i);
    //i 변수는 for문 밖에 선언됐기 때문에 for문이 실행이 종료돼도 사용할 수 있다.
    System.out.printf("i = %d\n", i);
    System.out.println("----------------");
    
    // 2) for문에서 사용할 로컬변수는 for 문에 선언한다.
    for (int k = 0; k < 5; k++)
      System.out.println(k);
    
    // for문에 선언된 로컬변수는 for 문의 실행이 끝나면 사라진다.
    //System.out.printf("k = %d\n", k); // 사용할 수 없다. 오류!
    System.out.println("----------------");
    
    // 3) 위에서 사용했던 k변수는 for문에 종속된 로컬변수이기 때문에,
    //    for문의 실행이 종료된 다음에는 존재하지 않는다. => 다른 for문에서 사용할 수 있다.
    //    => 중복이 아니다!
    for (int k = 0; k < 5; k++)
      System.out.println(k);
  }
}




