package v07;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class StorageMenuControl<E> extends MenuControl {
  ArrayList<E> list = new ArrayList<E>();
  
  public StorageMenuControl() {
  }
  
  public StorageMenuControl(Scanner scanner) {
    super(scanner);
  }
}
