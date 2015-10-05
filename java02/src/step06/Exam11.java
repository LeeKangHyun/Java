/*
 * 주제: 자바 핵심 클래스 - Object(6)
 * - getClass(): 클래스 정보를 리턴한다.
 */
package step06;

import java.lang.reflect.Method;

public class Exam11 {

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
      return super.clone();
    }

  }


  public static void main(String[] args) throws Exception{
    Student s1 = new Student("홍길동", "111-1111", false);
    
    // s1 레퍼런스가 가리키는 인스턴스의 클래스 정보를 알아내는 방법
    Class classInfo = s1.getClass();
    
    System.out.println(classInfo.getName());
    
    Class superClassInfo = classInfo.getSuperclass();
    System.out.println(superClassInfo.getName());
    
    Method[] methods = superClassInfo.getMethods();
    for (Method m : methods) {
      System.out.println(m.getName());
    }
    
    
  }
}




