package step12.ex04;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Test08 {

  // 특정 애노테이션 프로퍼티 값 추출하기
  @Retention(RetentionPolicy.RUNTIME)
  static @interface MyAnno {
    String value();
  }

  @MyAnno("테스트")
  static class MyClass {}


  public static void main(String[] args) {
    Class<?> clazz = MyClass.class;
    MyAnno anno = clazz.getAnnotation(MyAnno.class);
    System.out.println(anno.value());
  }
}



