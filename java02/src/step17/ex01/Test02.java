package step17.ex01;

public class Test02 {
  
  public static void main(String[] args) {
    Thread main = Thread.currentThread();
    System.out.println("현재 스레드명: " + main.getName());
    
    
    // 스레드 그룹?
    // - 스레드가 소속되어 있는 그룹
    ThreadGroup tg = main.getThreadGroup();
    System.out.println("main 스레드의 그룹명: " + tg.getName());
  }
}









