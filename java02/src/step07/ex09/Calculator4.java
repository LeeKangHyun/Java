package step07.ex09;

import step07.ex05.Calculator3;

public class Calculator4 extends Calculator3 {
  // 이름은 같지만 타입이 다른 메소드 추가 => 오버로딩
  // - 파라미터의 타입과 개수는 다르더라도 같은 기능을 수행한다면 
  //   같은 이름을 갖게함으로써 프로그래밍의 일관성을 부여하는 문법
  // - 같은 클래스에 있는 메소드이든 상속 받은 메소드이든 상관없다.
  public void plus(float value) {
    this.result += Math.round(value);
  }
  
  public void print() {
    System.out.printf("결과: %d\n", this.result);
  }
}
