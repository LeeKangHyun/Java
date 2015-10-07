package step07.ex14;

public class Calculator {
  protected int value;
  
  public void plus(int v)  {
    this.value += v;
  }
  
  public void minus(int v) {
    this.value -= v;
  }
  
  // 외부에서 value값을 꺼낼 수 있도록 도구, 방법(method)을 제공한다.
  // 보통 값을 꺼내는 메서드는 get이라는 이름으로 시작한다.
  // => 값을 꺼내는 메서드를"겟터(getter)"라고 부른다.
  // => 반대로 값을 설정하는 메서드는 "셋터(setter)"라고 부른다.
  public int getValue() {
    return this.value;
  }
}
