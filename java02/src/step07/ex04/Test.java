/*
 * 주제: 인스턴스 메서드
 * - 인스턴스를 사용하는 메서드는 인스턴스 메서드로 선언하라.!
 * - 인스턴스 메서드는 인스턴스 변수가 있어야만 동작한다.
 * - 만약, 인스턴스를 사용하지 않는 메서드가 있다면 클래스 메서드로 선언하라!
 * - 인스턴스 메서드는 인스턴스 주소를 저장할 변수를 내부적으로 갖고 있다.
 *   그 변수의 이름이 this이다.
 * - 인스턴스 메서드를 호출할 때 인스턴스 주소는 메서드 호출 앞에 적어야 한다.
 *   아규먼트로 전달하는 것이 아니다.
 *   => th
 */
package step07.ex04;

public class Test {

  public static void main(String[] args) {
    // 10 + 2 - 7 = ?
    // 8 - 6 + 3 = ?
    // 위 계산식의 결과를 따로따로 관리하기 위해서 인스턴스를 준비한다.
    Calculator c1 = new Calculator(); // result 변수가 준비된다.
    Calculator c2 = new Calculator();

    c1.plus(10);  // c1 레퍼런스에 들어있는 주소는 plus()를 호출할 때 this에 저장된다.
    c2.plus(8); // c2 레퍼런스에 들어있는 주소는 plus()를 호출할 때 this에 저장된다.
    // 표현!
    // 1) c1에 들어있는 주소를 줄테니 그 주소의 인스턴스를 사용하여 plus()작업을 수행하라.
    // 2) c1이 가리키는 인스턴스를 가지고 plus()작업을 수행하라.
    // 3) c1 인스턴스를 가지고 plus() 작업을 수행하라.
    // 4) c1 인스턴스에 대해 plus() 작업을 수행하라.
    // 5) c1에 대해 plus()를 호출하라.**
    // 6) c1 객체에 plus 메시지를 보내라.
    
    c1.plus(2);
    c2.minus(6);

    c1.minus(7);
    c2.plus(3);

    // result를 인스턴스 변수로 선언하면
    // plus(), minus()의 작업 결과를 별개로 관리할 수 있다는 것을 알 수 있다.

    System.out.println(c1.result);
    System.out.println(c2.result);

  }

}









