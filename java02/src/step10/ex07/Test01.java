package step10.ex07;

import java.util.HashMap;
import java.util.Map.Entry;

public class Test01 {
  static class Student {
    String name;
    String tel;
    
    public Student(String name, String tel) {
      this.name = name;
      this.tel = tel;
    }

    @Override
    public String toString() {
      return "Student [name=" + name + ", tel=" + tel + "]";
    }
    
    
  }
  public static void main(String[] args) {
    HashMap<String,Student> map = new HashMap<String,Student>();
    //map.put(1, "아무거나"); // 오류! key와 value의 타입이 맞지 않다.
    //map.put("s01", "문자열");  // 오류! value의 타입이 맞지않다.
    map.put("s01", new Student("홍길동", "111-1111"));
    map.put("s02", new Student("임꺽정", "111-1111"));
    map.put("s03", new Student("유관순", "111-1111"));
    
    // Entry: key/value 값을 보관한 객체
    // => Entry 목록을 얻기. 입력 순서와 상관없다.
   for (Entry<String, Student> entry : map.entrySet()) {
     System.out.printf("%s: %s\n", 
         entry.getKey(),
         entry.getValue(), 
         entry.getValue().toString());
   }
  }
}
