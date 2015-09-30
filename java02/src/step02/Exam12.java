/*
 * 주제: 조건 연산자: (논리값) ? 문장1:문장2
 */
package step02;

public class Exam12 {

  public static void main(String[] args) {
    int age = 30;
    
    // 조건문
    if (age >= 19)
      System.out.println("성인입니다.");
    else
      System.out.println("미성년자입니다.");
    
    // 조건 연산자
    System.out.println((age >= 19) ? "성인입니다." : "미성년자입니다.");
  }
}




