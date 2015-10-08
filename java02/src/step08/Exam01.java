/*
 * JVM의 메모리 관리: Method Area와 Stack 영역
 * - OS로부터 사용할 메모리를 받는다.
 * - 메모리를 크게 세 가지 영역으로 나눠 사용한다.
 *   1) Method Area
 *      => 클래스 파일(상수, 클래스 변수)
 *   2) Stack (per Thread)
 *      => 스레드 마다 자신만의 스택 메모리를 관리한다.
 *      => 프레임(로컬 변수, 파라미터 변수, this, 리턴 값)
 *   3) Heap
 *      => 인스턴스 
 *      => 가비지 콜렉터가 관리하는 영역
 */
package step08;

public class Exam01 {

  public static void main(String[] args) {
    System.out.println(args);
    int i = 10;
    int result = m1(i);
    m3(result);
  }
  static int m1(int i) {
    int x = m2(i);
    return i + x;
  }
  
  static int m2 (int i) {
    int x = i * i;
    return x;
  }
  
  static void m3 (int i) {
    System.out.println(i);
  }
}
