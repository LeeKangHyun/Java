package step07.ex07;

public class Student extends User {
  String name;
  int kor;
  int eng;
  int math;
  int sum;
  float aver;
  
  public Student() {
    //super();  // <--- 다른 생성자를 호출하는 문장이 있기때문에
                //      슈퍼 클래스의 기본 생성자를 호출하는 문장이 삽입되지 않는다.
    this("홍길동");

  }
  
  public Student(String name) {
    // 슈퍼 클래스의 생성자를 호출하든 자신의 생성자를 호출하든
    // 반드시 첫번째 문장으로 와야한다.
    // 다음과 같이 동시에 작성할 수 없다.
    super("user01", "1111");
    //this(name, 0, 0, 0);
    
    this.name = name;
  }
  
  public Student(String name, int kor, int eng, int math) {
    //super(); //<-- 다른 생성자를 호출하는 문장이 있기 때문에!
    this(name); // 기존 생성자 재활용! 이 문장이 있으면 슈퍼클래스 생성자를 호출하는 문장이
                // 자동으로 삽입되지 않는다.
    this.kor = kor;
    this.eng = eng;
    this.math = math;
    this.sum = kor + eng + math;
    this.aver = this.sum / 3.0f;
  }
}
