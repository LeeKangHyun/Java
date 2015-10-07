/*
 * 주제 : 클래스 멤버(변수와 메서드)의 공개 범위 지정하기 (3)
 * - 인스턴스 변수를 직접 접근 못하게 한다. 
 *   => 무효한 값이 들어갈 수 있다.
 *   => 시스템이 오동작하거나 잘못된 정보를 산출할 수 있다.
 * - 셋터를 통해 무효한 값을 걸러낸다.
 * - 인스턴스에 무효한 값이 들어가는 것을 막음으로써
 *   "추상화**"가 무너지는 것을 막는 문법이! "캡슐화(encapsulation)"라 부른다.
 * - 추상화란?
 *   클래스를 정의하는 것.
 *   시스템의 역할(바운더리, 컨트롤, 엔티티)을 식별하여 클래스 문법으로 정의하는 것.
 * - 캡슐은 변수 뿐만 아니라 메서드에 대해서도 적용한다. 
 */
package step07.ex15;

public class Test2 {
  public static void main(String[] args) {
    Customer2 c1 = new Customer2();
    
    c1.setName(null);
    c1.setGender(false);
    c1.setAge(200);
    c1.setHeight(180);
    c1.setWeight(70);
    c1.setFatRate(20);
    
    System.out.println(c1);
    
  }
}
