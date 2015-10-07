/*
 * 주제 : 클래스 멤버(변수와 메서드)의 공개 범위 지정하기 (2)
 * - 가능한 인스턴스 변수의 접근을 제한하라!
 * - 이유?
 *   무효한 값이 들어갈 수 있다. => 의도하지 않은 정보를 생산한다.
 */
package step07.ex15;

public class Test {
  public static void main(String[] args) {
    Customer c1 = new Customer();
    
    c1.name = "홍길동";
    // 다음 코드는 나이 값이 유효하지 않아도 프로그램 실행에 문제가 되지 않는다.
    // => 그러나 시스템의 유효한 데이터는 아니다.
    // => 잘못된 데이터는 사용자에게 잘못된 판단을 유도할 수 있다.
    // => 따라서 데이터를 검증하지 않고 직접 넣는 방식은 위험하다.
    // => 해결책: 가능한 시스템에 막대한 영향을 끼치는 인스턴스 변수는 직접 접근을 막아라.
    c1.age = 200;
    c1.gender = false;
    c1.height = 180;
    c1.weight = 120;
    c1.fatRate = 50;
    
    System.out.println(c1);
    
  }
}
