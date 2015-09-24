/*
 * 주제 : 정수 변수
 * - int(4), long(8), short(2), byte(1)
 */
package step01;

public class Exam04 {
  public static void main(String[] args) {
    byte b;
    short s;
    int i;
    long l;
    
    //i = Integer.MIN_VALUE;
    i = -2147483648;  // 위와 같다.
    //i = -2147483649;  // 4바이트 정수를 초과하는 수를 표기하기 때문에 오류 발생
    //i = -2147483649l; // 8바이트 정수 값을 4바이트 메모리에 넣을 수 없다.
    //i = 10L;  // 데이터를 넣을 수 있더라도 타입이 다르면 할당 불가 오류!
    System.out.println(i);

    //i = Integer.MAX_VALUE;
    i = 2147483647;
    //i = 2147483648; // 4바이트 정수 표기 오류.
    //i = 2147483648L;  // 데이터 타입이 일치하지 않는 오류.
    System.out.println(i);
    
    b = 10; // ?
    s = 10; // ?
  }
}