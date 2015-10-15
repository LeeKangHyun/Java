package step10.ex08;

import java.util.ArrayList;

public class Test01 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("홍길동0");
    list.add("홍길동1");
    list.add("홍길동2");
    list.add("홍길동3");
    list.add("홍길동4");
    list.add("홍길동5");
    
    // 인덱스가 짝수인 값만 
   for (int i = 0; i < list.size(); i+=2) {
     
     System.out.println(list.get(i));
   }
  }
}
