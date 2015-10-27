package step17.ex02;

public class Test04 {
  // 스레드 정의 4 - 스레드 생명 주기
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

    t1.start(); 

    /* 스레드 생명주기(lifecycle)
                    start()                 wait(), sleep()
    new Thread() ----------> Runnable 상태 -----------------> Not Runnable상태
                                  |       <-----------------
                   run() return   |      notify(), notifyAll()
                                  |            timeout
                                  |
                                 Dead
     1) Runnable 상태
        => CPU Racing에 참여한 상태. CPU사용권을 받을 수 있는 상태.
        
     2) Not Runnable 상태
        => CPU Racing에 참여하지 않은 상태. 스케쥴링에서 제외됨.
           CPU를 받지 못하는 상태.
     3) Dead상태
        => 스레드가 종료된 상태
        => Dead 상태에서는 다시 Runnable상태로 되돌아 갈 수 없다.
        => start()를 다시 호출 하면 오류가 발생한다!
    */
  }
}









