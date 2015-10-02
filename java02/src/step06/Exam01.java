/*
 * 주제: 자바 핵심 클래스 - String (1)
 */
package step06;

public class Exam01 {

  public static void main(String[] args) {
    // 1) 문자열 리터럴("Hello")은 내부적으로 String 인스턴스를 만든다.
    String s1 = "Hello";  // 문자열 인스턴스를 만드는 단축 문법
                          // 내부적으로 인스턴스 생성한다.
                          // s1에 문자열이 직접 저장되는 것이 아니다.
                          // s1은 레퍼런스 변수이다.
    String s2 = new String("Hello");  // 문자열 인스턴스를 만드는 공식 문법
    
    System.out.printf("%s %s\n", s1, s2);
    
    // 2) 따라서 s1은 레퍼런스 변수이다.
    String s3 = s1;
    
    if (s3 == s1)
      System.out.println("s1 == s3");
    
    if (s1 == s2)
      System.out.println("s1 == s2");
    
    // 3) 문자열 리터럴을 사용하여 String 인스턴스를 만들 때는
    //    기존에 상수 문자열과 같은 값일 경우 중복해서 만들지 않는다. 
    //    이전에 만든 인스턴스의 주소를 리턴한다.
    //    따라서, s1과 s4는 같은 주소를 담고 있다.
    String s4 = "Hello";
    if (s1 == s4)
      System.out.println("s1 == s4");
    
    // 4) new를 사용하여 String 인스턴스를 만들 때는
    //    무조건 새로 만든다.
    String s5 = new String("Hello");
    if (s2 == s5)
      System.out.println("s2 == s5");
    
    String s6 = new String("Hello");
    if (s5 == s6)
      System.out.println("s5 == s6");
    
    
  }

}
