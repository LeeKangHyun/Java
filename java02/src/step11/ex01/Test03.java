package step11.ex01;

public class Test03 {
  
  // Singleton 클래스 만들기
  //1) 외부에서 생성할 수 없도록 생성자를 private으로 접근을 제한한다.
  //2) 인스턴스를 리턴해 줄 스태틱 메서드를 만든다.
  //   - 인스턴스 주소를 저장할 클래스 변수를 만든다.
  //   - 한 번 인스턴스를 생성하면 다음 번 부터는 기존의 인스턴스를 리턴한다.
  
  public static void main(String[] args) {
    // Singleton 적용 후 
    // => getInstance()가 리턴하는 것은 같은 인스턴스다.
    Calculator c1 = Calculator.getInstance();
    Calculator c2 = Calculator.getInstance();
    
    c1.plus(10);
    c1.plus(20);
    c1.minus(3);
    
    c2.plus(30);
    c2.minus(40);
    
    System.out.printf("%d, %d\n", c1.result, c2.result);
  }
}






