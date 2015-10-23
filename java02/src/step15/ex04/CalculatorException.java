package step15.ex04;

// 엥?
// 슈퍼클래스에 기능이 추가된 것도 아니고, 왜 만들었을까?
// => 코딩할 때 눈에 띄라고.
public class CalculatorException extends Exception {
  private static final long serialVersionUID = 1L;

  public CalculatorException() {
    super();
  }

  public CalculatorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public CalculatorException(String message, Throwable cause) {
    super(message, cause);
  }

  public CalculatorException(String message) {
    super(message);
  }

  public CalculatorException(Throwable cause) {
    super(cause);
  }
  
  

}
