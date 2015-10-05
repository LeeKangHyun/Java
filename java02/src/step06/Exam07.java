/*
 * 주제: 자바 핵심 클래스 - Object(2)
 */
package step06;


public class Exam07 {

  static class Student {
    String name;
    String tel;
    boolean gender;
    
    public Student(String name, String tel, boolean gender) {
      this.name = name;
      this.tel = tel;
      this.gender = gender;
    }
  }
  
  
  public static void main(String[] args) {
    // 0) Object의 메서드를 상속 받았다는 것을 확인
    Student s1 = new Student("홍길동", "111-1111", false);
    Student s2 = new Student("홍길동", "111-1111", false);
    
    // 1) toString(): "클래스정보@식별번호"를 리턴한다.
    String str = s1.toString(); //  Object 로부터 상속받은 메서드 호출!
    System.out.println(str);
    System.out.println(s2.toString());

    // 2) hashcode(): 식별번호만 리턴한다.
    //    => 식별번호: 인스턴스의 내용을 구분하는 값이다.
    //    => Object에서 상속 받은 날 것의 hashCode()는 인스턴스 내용에 상관없이
    //       무조건 인스턴스 마다 고유의 식별번호를 리턴한다.
    //    => 다음 코드를 실행해 보면 값은 같은데 인스턴스가 다르기 때문에 식별번호가 다르다.
    System.out.println(Integer.toHexString(s1.hashCode()));
    System.out.println(Integer.toHexString(s2.hashCode()));
    
    StringBuffer sb1 = new StringBuffer("Hello");
    StringBuffer sb2 = new StringBuffer("Hello");
    System.out.println(Integer.toHexString(sb1.hashCode()));
    System.out.println(Integer.toHexString(sb2.hashCode()));
    
    System.out.println(sb1.toString());
    System.out.println(sb2.toString());
    // StringBuffer의 toString()은 "클래스정보@식별번호" 형식으로 문자열을 리턴하지 않는다.
    // 이유? Object로부터 상속 받은 toString()메소드를 재정의 했기 때문이다.
    // 왜 재정의 했나? StringBuffer클래스의 목적에 맞추기 위해 재정의 했다.
    //              StringBuffer는 문자열을 다루는 클래스이다.
    //              당연히 그 내용을 toString()으로 만들려면 그 내용을 리턴해야 한다.
    //              그래서 상속 받은 메서드를 재정의 한 것이다.
    // "오버라이딩(Overriding)"?
    // => 이렇게 상속 받은 메소드를 해당 클래스의 목적에 맞게끔 재정의 하는 것.
    
    // StringBuffer는 Object로부터 상속 받은 메서드를 재정의 했고, 
    // Student는 재정의 하지 않았다.
    // 그래서 Student에 대해 toString()을 호출하면 "클래스정보@식별번호" 문자열을 출력한다.
  }
}




