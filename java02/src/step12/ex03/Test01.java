package step12.ex03;

public class Test01 {
  
  static class MyChild extends MyClass {
    @Override
    public void m1() {
      super.m1();
      System.out.println("오호라... 재정의하였네!");
    }
  }
  public static void main(String[] args) {
    MyChild p = new MyChild();
    p.value = 20;
    p.m1();
  }
}
