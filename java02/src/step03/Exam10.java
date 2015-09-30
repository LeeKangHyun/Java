/*
 * 주제: 블록과 변수의 범위
 */
package step03;

public class Exam10 {
  static int v1;  // 클래스 변수: 한 번 생성되면 프로그램을 종료할 때 까지 유지된다.
  int v2; // 인스턴스 변수: 인스턴수가 생성될 때 준비되고, 인스턴스가 삭제되면 사라진다.
  
  public static void main(String[] args) {
    v1 = 10;
    //v2 = 20;  // 인스턴스를 통해서만 접근할 수 있다. 오류!
    Exam10 instance1 = new Exam10();  
    instance1.v2 = 20;

    Exam10 instance2 = new Exam10();
    instance2.v2 = 40;

    System.out.printf("%d, %d\n", instance1.v2, instance2.v2);
    
    //3) 로컬 변수 사용
    int v3 = 30;  // 로컬 변수는 메서드를 실행하는 동안만 유지된다.
                  // 메서드 호출이 끝나면 사라진다.
    {
      int v4 = 40;  // 블록 안에 선언된 로컬 변수는 블록이 끝나는 순간 제거된다.
      {
        int v5 = 50;
        System.out.println(v3);
        System.out.println(v4);
        System.out.println(v5);
        System.out.println("----------------");
      }
      System.out.println(v3);
      System.out.println(v4); 
      //System.out.println(v5); // 오류! 블록을 벗어나면 로컬변수를 사용할 수 없다.
      System.out.println("----------------");
    }
    System.out.println(v3);
    //System.out.println(v4); // 오류! 블록을 벗어나면 로컬변수를 사용할 수 없다.
    System.out.println("----------------");
  }
  
  { // "인스턴스 블록"이다.
    v1 = 100;
    v2 = 200;
    //v3 = 300; // 오류! main() 메서드 블록을 벗어나면 해당 로컬변수를 사용할 수 없다.
  }
}




