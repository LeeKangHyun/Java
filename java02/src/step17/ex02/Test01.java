package step17.ex02;

public class Test01 {
  // 스레드 정의 1 - Thread 상속 받기
  static class MyThread extends Thread {
    public MyThread(String name) {
      super(name);
    }

    @Override
    public void run() {
      for (int i = 0; i < 100; i++) {
        System.out.println(this.getName() + ":" + i);
      }
    }
  }

  public static void main(String[] args) {
    MyThread t1 = new MyThread("t1");

    //=> 스레드 시작
    t1.start(); 
    // CPU사용권을 얻기 위해 대기하는 상태로 들어간다. "Runnable" 상태
    // Runnable 상태로 보낸 후 즉시리턴한다. => 다음 문장으로 바로간다.

    System.out.println("********************************");

    // main 스레드가 main() 호출을 끝냈다 하더라도,
    // 자식 스레드가 실행 중이면 JVM을 종료하지 않는다.

  }
}