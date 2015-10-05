/*
 * 주제: 자바 핵심 클래스 - Object(2)
 * 
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
  }
}




