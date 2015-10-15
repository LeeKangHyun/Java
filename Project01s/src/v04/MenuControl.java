package v04;

import java.util.Scanner;

public abstract class MenuControl {
  protected Scanner scanner;
  
  public MenuControl() {}
  
  public MenuControl(Scanner scanner) {
    this.scanner = scanner;
  }
  // service() 메서드는 어차피 하위클래스에서 재정의 해야만 하는 메서드 이다.
  // => 굳이 구현할 필요가 있나요?
  // => 하위 클래스에서 반드시 구현해야 하는 메서드 아닌가요?
  //    하위 클래스가 반드시 구현하도록 강제할 방법은 없나요?
  // => 해결책: 추상 메서드로 선언하라. 당연히 추상클래스 만이 추상 메서드를가질수 있다.
  public abstract void service(); // 추상 메서드는 구현할 수 없다.
  
}
