package step17.ex02;

public class Test02 {
  // 스레드 정의 2 - Runnable 인터페이스 구현하기
  // => Thread가 실행할 코드를 갖고 있는 객체!
  // => 비록 스레드가 아니라서 직접 스레드처럼 실행할 수 없지만,
  //    어느 클래스든지 Runnable 인터페이스를 구현하여
  //    스레드가 할 일을 작성할 수 있다는 것이 장점이다.
  static class MyRunnable implements Runnable {
    String name;
    public MyRunnable(String name) {
      this.name = name;
    }
    @Override
    public void run() {
      for (int i = 0; i < 100; i++) {
        System.out.println(this.name + ":" + i);
      }
    }
  }

  public static void main(String[] args) {
    MyRunnable r = new MyRunnable("t1");
    Thread t1 = new Thread(r);

    //=> 스레드 시작 => Thread에 장착된 MyRunnable 객체의 run()메서드를 호출한다.
    t1.start(); 
    
    for (int i = 0; i < 100; i++)
    System.out.println("********************************");
  }
}