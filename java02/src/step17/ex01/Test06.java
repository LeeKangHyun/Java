/*
 * CPU Racing(CPU 사용권을 얻기 위해 경쟁하는 것)
 * --> 스레드는 프로세스와 동일한 자격으로 CPU쟁탈전에 참여한다.
 * --> OS의 스케쥴링 방식에 따라 다르다. => Round Robin, Priority
 * --> CPU 사용 시간은 OS에 의해 결정 된다.
 * --> 순서대로 CPU사용권을 주지 않는다.
 * --> 전체 실행 횟수로 따지면, 각 스레드마다 골고루 준것이 된다.
 */
package step17.ex01;

public class Test06 {

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
    // main 스레드에서 스레드를 생성하면
    // 생성된 스레드는 main의 자식 스레드가 된다.
    // 부모 스레드와 동일한 우선 순위를 갖는다.
    MyThread t1 = new MyThread("t1 ==> ");  // main 스레드의 자식 스레드이다.
    MyThread t2 = new MyThread("t2 $$ ");
    t1.start();
    t2.start();
    for (int i = 0; i < 100; i++) {
      System.out.println("main:" + i);
    }
  }
}









