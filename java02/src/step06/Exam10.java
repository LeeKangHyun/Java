/*
 * 주제: 자바 핵심 클래스 - Object(5)
 * - clone: 인스턴스의 메모리 값을 그대로 복제.
 *          같은 값을 가진 인스턴스를 만들고 싶을 때 사용한다.
 *          새로 인스턴스를 만들고 값을 복사하는 방법보다 속도가 빠르다 
 */
package step06;


public class Exam10 {

  static class Student implements Cloneable {
    String name;
    String tel;
    boolean gender;

    public Student(String name, String tel, boolean gender) {
      this.name = name;
      this.tel = tel;
      this.gender = gender;
    }
    @Override 
    public String toString() {
      return "[" + this.name + "," + this.tel + ","
          + (this.gender ? "여자" : "남자") + "]";
    }
    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + (gender ? 1231 : 1237);
      result = prime * result + ((name == null) ? 0 : name.hashCode());
      result = prime * result + ((tel == null) ? 0 : tel.hashCode());
      return result;
    }
    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Student other = (Student) obj;
      if (gender != other.gender)
        return false;
      if (name == null) {
        if (other.name != null)
          return false;
      } else if (!name.equals(other.name))
        return false;
      if (tel == null) {
        if (other.tel != null)
          return false;
      } else if (!tel.equals(other.tel))
        return false;
      return true;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
      // super.메서드()
      // => 오버라이딩 하기 전의 상속 받은 메서드를 호출할 때!
      return super.clone();
    }

  }


  public static void main(String[] args) throws Exception{
    Student s1 = new Student("홍길동", "111-1111", false);
    
    // 1) 일반적인 복제
    Student s3 = new Student("","",false);
    s3.name = s1.name;
    s3.tel = s1.tel;
    s3.gender = s1.gender;
    
    // 2) clone()을 이용한 복제: 위의 방법보다 더 빠르다. 왜? 메모리 복제이기 때문에.
    Student s2 = (Student)s1.clone();
    
    System.out.println(s1);
    System.out.println(s2);
    
    if (s1 == s2)
      System.out.println("s1 == s2");
    System.out.println("----------------");

  }
}




