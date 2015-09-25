/*
 * 주제: 비트 연산자
 */
package step02;

public class Exam08 {

  public static void main(String[] args) {
    int i;

    //1) 비트 이동 연산자
    i = 10;

    //오른쪽으로 1비트 이동 연산자
    //앞의 빈 자리는 부호비트(양수 0, 음수 1)로 채운다.
    //뒤의 넘어간 값은 제거한다.
    //    00001010
    // >>  00001010
    //  -------------
    //    00000101(5)
    System.out.println(i >> 1);

    //2) 음수의 비트 이동 연산자
    //    11111111111111111111111111110110
    //  >> 11111111111111111111111111110110
    //    ----------------------------------
    //    11111111111111111111111111111011(?)
    i = -10;
    System.out.println(Integer.toBinaryString(i));
    System.out.println(Integer.toBinaryString(i >> 1));
    System.out.println(i >> 1);

    //3) 특별한 비트 이동 연산자 : >>>
    // - 앞의 빈자리를 0으로 채운다.
    i = -10;
    System.out.println(Integer.toBinaryString(i));
    System.out.println(Integer.toBinaryString(i >>> 1));
    System.out.println(i >>> 1);

    //4) 왼쪽으로 이동
    // - << 연산자는 있고, <<< 연산자는 없다.
    // - 왼쪽에 넘어간 값은 제거된다. 오른쪽에 빈 자리는 무조건 0으로 채운다.
    //      00001010
    // <<  00001010
    //  -------------
    //     000010100(20) 
    i = 10;
    System.out.println(Integer.toBinaryString(i));
    System.out.println(Integer.toBinaryString(i << 1));
    System.out.println(i << 1); //i * 2^1 = i * 2
    System.out.println(i << 2); //i * 2^2 = i * 4
    System.out.println(i << 3); //i * 2^3 = i * 8
    //i * 8을 수행하는 것 보다 3비트를 이동하는 것이 속도가 더 빠르다.

  }
}




