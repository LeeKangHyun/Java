/*
 * 주제 : 클래스 멤버(변수와 메서드)의 공개 범위 지정하기
 * - 보통 메서드는 외부에서 자유롭게 이용할 수 있도록 완전 공개한다.(public)
 * - 클래스 멤버에 아무것도 붙이지 않으면(default) 기본 접근만 허용한다.
 *   기본 접근이란? 같은 패키지 소속 클래스만 사용할 수 있다.
 * - 기본 접근에 더하여 자식 클래스까지 사용을 허락하고 싶다면 "protected"
 *   보호모드로 공개한다.
 *   인스턴스 변수에 대해 주로 사용한다.
 * - 오직 내부에서만 사용할 때는 바깥에서 보지 못하도록 막아라! (private)
 *   인스턴스 변수에 대해 적용할 때가 많고,
 *   가끔 인스턴스 메서드에 대해서도 적용할 때가 있다.
 * private: 오직 클래스 멤버!!
 * default: 클래스 멤버 + 같은 패키지 소속 멤버
 * protected : (default) + 자식 클래스
 * public : 모두에게 공개
 */
package step07.ex14.test;

import step07.ex14.Calculator;

public class Test {
  public static void main(String[] args) {
    Calculator cal = new Calculator();
    cal.plus(10);
    cal.minus(5);
    cal.plus(2);

    // 만약 개발자가 클래스 용볍을 무시하고 자기 마음대로 사용할 경우,
    // 예) 계산 결과를 직접 넣는다.
    //cal.value = 100;  // 그러나 value의 접근 권한을 막았기 때문에 오류!
    
    // 인스턴스 value 변수는 protected로 보호되기 때문에 다른 패키지에서는 직접 접근할 수 없다.
    //System.out.println(cal.value);
    
    // 대신 다음과 같이 겟터 도구(메서드)를 사용하여 value 값을 꺼낸다.
    System.out.println(cal.getValue());
  }
}
