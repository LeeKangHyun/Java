/*
 * 주제 : 상속 관계에서 생성자 작성 및 호출 순서
 * - 생성자 작성
 *   => 반드시 생성자의 첫 문장으로 슈퍼 클래스의 어떤 생성자를 호출할지 지정해야 한다.
 *   => 문법: super();
 *           super("문자열");
 *           super(10);
 *           super("문자열", 20);
 *   => 만약 개발자가 슈퍼 클래스의 생성자 호출을 생략한다면,
 *      자바 컴파일러가 자동으로 슈퍼 클래스의 기본 생성자를 호출 문장을 삽입한다.
 *      예) super();
 *   => 반드시 첫.문.장!
 *   => 슈퍼 클래스의 생성자를 호출 한느 명령어는 생성자 메서드에서만 사용 가능하다.다른 
 */

package step07.ex06;

public class test02 {

  public static void main(String[] args) {
    D p = new D();
        
  }

}
