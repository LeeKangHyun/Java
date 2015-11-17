package exam;

public class Hello {

  @Override
  public String toString() {
    return "오호라... 안녕~~~";
  }

  // 한글 주석.
  public static void main(String[] args) {
    System.out.println("안녕하세요.");

    Hello p = new Hello();
    System.out.println(p.toString());

    String name = "홍길동";
    switch(name) {
    case "홍길동":
      System.out.println("오호라~ 길동!");
      break;
      
    default:
      System.out.println("안녕~");
    }
  }

}
