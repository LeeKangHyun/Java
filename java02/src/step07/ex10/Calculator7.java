package step07.ex10;

public class Calculator7 extends Calculator6 {
  float result;
  
  public void print2() {
    System.out.println(super.result); // 재정의 하기 전의 result
    System.out.println(result);       // 재정의 변수
  }
}
