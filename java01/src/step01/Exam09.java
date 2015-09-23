/*
 *주제 : 메모리의 종류는 고정형이다.
 * - 정수 값을 저장할 메모리는 다른 종류의 값을 저장할 수 없다.
 * - 정적 타입 바인딩(Static Type Binding)이라고 부른다.
 */
package step01;

public class Exam09/*프로그램명*/ {
  public static void main(String[] args) {
    int i1 = 20;
    //i1 = 3.14159;
    //i1 = true;
    //i1 = "Hello";
    
    System.out.println(i1);
  }
}