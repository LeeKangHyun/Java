package step12.ex02;

import java.lang.reflect.Modifier;

public class Test01 {

  static class Student {
    String name;
    String tel;
    
    @Override
    public String toString() {
      return "Student [name=" + name + ", tel=" + tel + "]";
    }
  }
  
  public static void main(String[] args) throws Exception{
    // 클래스 로딩 및 클래스 정보 객체 가져오기
    // => 만약 이미 로딩되어 있다면 기존에 생성한 클래스 정보 객체를
    //    리턴할 것이다.
    // => 각 클래스 마다 하나의 정보 객체를 갖고 있다. 
    Class classInfo = Class.forName("java.lang.String");

    // 클래스 이름 알아내기
    System.out.println(classInfo.getName());
    System.out.println(classInfo.getCanonicalName());
    System.out.println(classInfo.getSimpleName());
    System.out.println(Modifier.toString(classInfo.getModifiers()));


    // 클래스 정보 객체를 가지고 인스턴스를 생성한다.
    String s1 = (String)classInfo.newInstance();
    System.out.println(s1);
    
    System.out.println("----------------");
    
    Class classInfo2 = Class.forName("step12.ex02.Test01$Student");
    Student student = (Student)classInfo2.newInstance();
    
    student.name = "홍길동";
    student.tel = "111-1111";
    System.out.println(student);
  }

}









