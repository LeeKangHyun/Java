package step12.ex03;

public class Test03 {
  
  static class MyChild extends MyClass3 {
    /* 문법 오류! final 메서드는 재정의 할 수 없다.
    @Override
    public void m1() {
      super.m1();
      System.out.println("오호라... 재정의하였네!");
    }*/
  }
  public static void main(String[] args) {
    MyChild p = new MyChild();
    //p.value = 20; // 상수라서 값을 할당할 수 없다.
    p.m1();
  }
}
