package step12.ex02;

import java.lang.reflect.Method;

public class Test04 {

  static class Student {
    String name;
    String tel;

    @Override
    public String toString() {
      return "Student [name=" + name + ", tel=" + tel + "]";
    }
  }

  public static void main(String[] args) throws Exception {
    Class clazz  = Student.class;
    Student obj = (Student)clazz.newInstance();
    obj.name = "홍길동";
    obj.tel = "111-1111";
    
    //clazz.toString();
    // => "toString" 이라는 이름을 갖는 메서드를 찾는다.
    // => 아규먼트를 받지 않는 메서드 이다.
    Method m = clazz.getMethod("toString");
        
    // 메서드 호출
    // => 첫 번째 아규먼트는 인스턴스 이다.
    // => 두 번째 아규먼트부터는 해당 메서드에 전달할 값이다.
    //    toString()은 아규먼트를 전달할 필요가 없기 때문에 두 번쨰 아규먼트는 적을 필요가 없다.
    System.out.println(m.invoke(obj));
  }
}








