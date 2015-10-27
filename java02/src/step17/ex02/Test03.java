package step17.ex02;
/* Runnable 인터페이스 구현의 이점
 * => 인터페이스이기 때문에 누구든지 Runnable이 될 수 있다.
 */
public class Test03 implements Runnable{
  static String name = "t1";
  
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println(Test03.name + ":" + i);
    }
  }

  public static void main(String[] args) {
    
    Test03 r = new Test03();
    Thread t1 = new Thread(r);
    t1.start(); 
    for (int i = 0; i < 100; i++)
      System.out.println("********************************");
  }
}