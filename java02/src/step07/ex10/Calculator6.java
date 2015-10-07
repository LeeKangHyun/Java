package step07.ex10;

public class Calculator6 extends Calculator5 {
  StringBuffer expression = new StringBuffer();

  // 생성자란/
  // - 인스턴스를 생성한 후 자동으로 호출되는 메소드이다. 인스턴스 값을 초기화시키는 용도.
  // - "인스턴스가 ***제대로 사용될 수 있도록*** 올바른 값으로 초기화 시키는 용도."
  public Calculator6() {
    expression.append("0");
  }

  @Override
  public void print() {
    System.out.println("------------------------");
    // 재정의 전.전의 메서드를 호출할 수 없다.
    //super.super.print();
    System.out.println(expression.toString() + " = " + this.result);
    System.out.println("------------------------");
  }

  @Override
  public void plus(int a) {
    super.plus(a);  // 원래 하던 일을 계속하게 한다.

    expression.append(" + " + a);
  }

  @Override
  public void plus(float value) {
    super.plus(value);
    expression.append(" + " + value);
  }

  @Override
  public void multiple(int a) {
    super.multiple(a);
    expression.append(" * " + a);
  }

  @Override
  public void divide(int a) {
    super.divide(a);
    expression.append(" / " + a);
  }

  @Override
  public void minus(int a) {
    super.minus(a);
    expression.append(" - " + a);
  }
}
