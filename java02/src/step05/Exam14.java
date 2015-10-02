/* 
 * 주제: 스태틱 변수와 블록 활용
 */
package step05;

public class Exam14 {

  static class Student {
    // 클래 변수는 클래스가 로딩될 때 생성된다.
    // 인스턴스 생성과 상관없다.
    // 클래스 변수의 용도: 모든 인스턴스들이 공유하는 값을 저장한다.
    static int count;
    
    long no;
    String name;
    String tel;

    static {  // 스태틱 블록 용도: 스태틱 변수 초기화
      count = 100000;
      //no = 10;  // 스태틱 블록에서는 인스턴스 멤버(변수/메소드)에 접근할 수 없다.
    }
    
    public Student(String name, String tel) { 
      this.no = ++count;
      this.name = name;
      this.tel = tel;
    }
    
    public void print() {
      System.out.printf("%d, %s, %s\n", this.no, this.name, this.tel);
    }
  }

  public static void main(String[] args) {
    Student s1 = new Student("홍길동", "111-1111");
    Student s2 = new Student("임꺽정", "111-1112");
    Student s3 = new Student("신채호", "111-1113");
    
    s1.print();
    s2.print();
    s3.print();
  }
}




