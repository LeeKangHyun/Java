package step15.ex02;

public class Test02 {

  public static void main(String[] args) {
    // 하위 메서드에서 최상위 메서드로 오류를 전달하기 : 스텔스 기법
    // m4() -> main();
    // => 방법?
    //    Throwable 대신 그 하위 클래스인 Error를 던진다.
    try {
      m1();
    } catch (Throwable err) {
      System.out.println(err.getMessage());
    }
  }

  public static void m1() {
    m2();
  }

  public static void m2() {
    m3();
  }

  public static void m3() {
    m4();
  }

  // Error객체를 던지면 메서드 선언부에 예외 선언을 할 필요가 없다. - "스텔스 모드"
  // => 중간 호출자의메서드 선언부에 예외 선언 문구를 넣을 필요가 없다.
  // => 그러나 예외를 받고자 한다면 try-catch로 바꿀 수 있다.
  //
  // 주의!
  // Error 클래스는 JVM에서 발생하는 오류("시스템 예외")를 던질 때 사용 된다.
  // 그래서, 애플리케이션에서 사용하는 것은 바람직하지 않다. => 사용하지 말아라!
  // 애플리케이션을 위해서 Error처럼 스탤스 모드로 예외를 전달하는 클래스를 제공!
  // => RuntimeException 클래스!
  // => 이렇게 애플리케이션에서 발생하는 예외를 "애플리케이션 예외"라고 부른다.
  public static void m4() {
    //throw new Error("오류!!!");
    throw new RuntimeException("오류!");
  }

}
