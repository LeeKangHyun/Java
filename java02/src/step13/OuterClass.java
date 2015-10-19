package step13;

public class OuterClass {
  // 1) top level inner class
  static class TopLevel {}

  // 2) member inner class
  class MemberInner {}

  public void m() {
    // 3) local inner class
    class Local {}

    // 4) anonymous inner class: 서브 클래스 만들기
    MenuControl p1 = new MenuControl() {
      public void test() {} // 새 메서드 추가하기
    };

    // 5) anonymous inner class: 인터페이스 구현 클래스 만들기
    Command p2 = new Command() {
      public void execute() {}
    };

  }

  class MenuControl {
    public void service() {}
  }

  interface Command {
    void execute();
  }
}
