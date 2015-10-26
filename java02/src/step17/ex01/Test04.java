package step17.ex01;

public class Test04 {

  public static void main(String[] args) {
    Thread mainT = Thread.currentThread();
    ThreadGroup mainTG = mainT.getThreadGroup();
    ThreadGroup systemTG = mainTG.getParent();
    System.out.println(systemTG.getName());

    //system 스레드 그룹의 자식 그룹 알아내기
    ThreadGroup[] groupList = new ThreadGroup[10];
    int size = systemTG.enumerate(groupList, false); // false: 직계 그룹 목록만 리턴할 것.

    for (int i = 0; i < size; i++) {
      System.out.println(" -> TG:" + groupList[i].getName());
      printThreadList(groupList[i], "    ");
      
    }

    // system 스레드 그룹의 자식 스레드 알아내기
    printThreadList(systemTG, "  ");
  }

  private static void printThreadList(ThreadGroup tg, String indent) {
    Thread[] threadList = new Thread[10];
    int size = tg.enumerate(threadList, false);
    for (int i = 0; i < size; i++) {
      System.out.println(indent + " -> t:" + threadList[i].getName());
    }

  }
}









