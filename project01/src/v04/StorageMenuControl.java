package v04;

import java.util.ArrayList;
import java.util.Scanner;

// 이 클래스가 추상 클래스가 되어야 하는 이유?
//1) 직접 사용할 목적으로 만든 클래스가 아니다. 다른 클래스에게 ArrayList를 상속해주기 위해
//   존재하는 클래스이다.
//2) MenuControl로부터 상속받은 service() 메서드를 구현할 이유가 없다.
//   추상 메서드를 그대로 가지려면 추상 클래스가 되어야 한다.
public abstract class StorageMenuControl<E> extends MenuControl {
  ArrayList<E> list = new ArrayList<E>();
  
  public StorageMenuControl() {}
  
  public StorageMenuControl(Scanner scanner) {
    super(scanner);
  }
}
