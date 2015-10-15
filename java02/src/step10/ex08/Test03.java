package step10.ex08;

import java.util.ArrayList;

public class Test03 {
  
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("홍길동0");
    list.add("홍길동1");
    list.add("홍길동2");
    list.add("홍길동3");
    list.add("홍길동4");
    list.add("홍길동5");
    
    for (String v: list) {
      System.out.println(v);
    }
  }
}
