package step12.ex02;

import java.lang.reflect.Method;

public class Test05 {

  static class Student {
    String name;
    String tel;

    @Override
    public String toString() {
      return "Student [name=" + name + ", tel=" + tel + "]";
    }
    
    public static void m1() {
      System.out.println("m1()");
    }
    
    public static void m1(String name) {
      System.out.printf("m1(%s)\n", name);
    }
    
    public static void m1(String name, int age) {
      System.out.printf("m1(%s, %d)\n", name, age);
    }
  }

  public static void main(String[] args) throws Exception {
    Class clazz  = Student.class;
    
    Method p1 = clazz.getMethod("m1");
    Method p2 = clazz.getMethod("m1", String.class);
    Method p3 = clazz.getMethod("m1", String.class, int.class);
    
    //p1.invoke(null, "홍길동"); // 오류! 아규먼트를 넘길수 없는 메서드이다.
   p1.invoke(null);
   p2.invoke(null, "홍길동");
   p3.invoke(null, "홍길동", 20);
  }
}








