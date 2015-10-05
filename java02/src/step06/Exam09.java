/*
 * 주제: 자바 핵심 클래스 - Object(4)
 * - equals(): 인스턴스가 같은지 검사하는 메소드이다.
 */
package step06;


public class Exam09 {

  static class Student {
    String name;
    String tel;
    boolean gender;

    public Student(String name, String tel, boolean gender) {
      this.name = name;
      this.tel = tel;
      this.gender = gender;
    }
    @Override // 오버라이드 검사를 요청하는 주석이다.
    public String toString() {
      return "[" + this.name + "," + this.tel + ","
          + (this.gender ? "여자" : "남자") + "]";
    }
    // Student의 값이 같을 때 true를 리턴하도록 equals()를 오버라이딩 하자!
    @Override
    public boolean equals(Object obj) {
      if (obj == null)
        return false;

      if (!(obj instanceof Student))
        return false;

      // obj에 들어 있는 주소가 Student의 주소이니, 
      // 원래 타입의 레퍼런스로 만들어 사용하도록 한다.
      // 그래야 온전히 Student의 모든 기능을 이용할 수 있다.
      Student other = (Student)obj;

      if (!this.name.equals(other.name))
        return false;

      if (!this.tel.equals(other.tel))
        return false;

      if (this.gender != other.gender)
        return false;

      return true;
    }
    
  }


  public static void main(String[] args) {
    Student s1 = new Student("홍길동", "111-1111", false);
    Student s2 = new Student("홍길동", "111-1111", false);
    Student s3 = new Student("홍길동", "111-1111", true);
    
    if (s1.equals(s2))
      System.out.println("s1.equals(s2)");
    if (s1.equals(s3))
      System.out.println("s1.equals(s3)");
    System.out.println("----------------");

    String str1 = new String("Hello");
    String str2 = new String("Hello");

    // 인스턴스가 다름에도 불구하고 equals()를 true리턴한다. 이유는?
    // => 상속 받은 equals()를 overriding했기 때문이다.
    // => 문자열이 같으면 true를 리턴하도록 재정의 하였다.
    if (str1.equals(str2))
      System.out.println("str1.equals(str2)");
    System.out.println("----------------");

    StringBuffer sb1 = new StringBuffer("Hello");
    StringBuffer sb2 = new StringBuffer("Hello");    

    // StringBuffer는 상속 받은 toString()을재 오버라이딩 하지 않았다.
    // 그래서 리턴값이 false이다.
    if (sb1.equals(sb2))
      System.out.println("sb1.equals(sb2)");
    System.out.println("----------------");

    // 자바에서 제공해주는 클래스를 사용할 때, toString()메소드의 재정의 여부 알아내기:
    // => API문서 메서드 목록에 상속 받은 메소드가 있을때!
  }
}




