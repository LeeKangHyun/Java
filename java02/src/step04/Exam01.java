/* 
 * 주제: 배열 - 같은 종류의 메모리를 여러 개 준비하는 방법
 */
package step04;

public class Exam01 {

  public static void main(String[] args) {
    // 1) 배열을 사용하기 전
    int kor, eng, mat, soc, sci, tot, ave;
    kor = 100;
    eng = 90;
    mat = 100;
    soc = 90;
    sci = 100;
    tot = kor + eng + mat + soc + sci;
    ave = tot / 5;

    int sub1, sub2, sub3, sub4, sub5, sub6, sub7;
    sub1 = 100;
    sub2 = 90;
    sub3 = 100;
    sub4 = 90;
    sub5 = 100;
    sub6 = sub1 + sub2 + sub3 + sub4 + sub5;
    sub7 = sub6 / 5;

    // 2) 배열을 사용한 후
    //  - 배열은 new명령어를 사용해서 만든다.
    //  - 자바에서는 primitive type(원시타입)을 제외한 모든 메모리는 new 사용해 준비.
    int[] sub = new int[7]; // 배열을 준비한 후 배열 변수에 저장한다.
    //int sub[] = new int[7];
    //int a[] = 10; // 배열을 저장하는 변수에는 반드시 배열을 줘야한다. 값을 주면 오류!
    //long[] sub = new int[7];  // 배열의 종류에 맞춰서 배열 변수에 담아야 한다. 다르면 오류!

    // - 배열에 값 넣기
    //   배열변수[인덱스] = 값;
    // - 인덱스는 0부터 시작한다.
    // - 마지막 인덱스는 배열크기 보다 하나 작은 수이다.
    sub[0] = 100;
    sub[1] = 90;
    sub[2] = 100;
    sub[3] = 90;
    sub[4] = 100;
    sub[5] = 0;

    for (int i = 0; i < 5/*직관성*/; i++) { 
      sub[5] += sub[i];
    }
    sub[6] = sub[5] / 5;
    //sub[7] = 100; // 컴파일할 때 오류가 발생하지 않지만, 
    //실행할 때 인덱스 범위 오류가 발생!
    for (int i = 0; i < 5; i++) {
      System.out.println(sub[i]);
    }
    System.out.printf("총점 = %d, 평균 = %d\n", sub[5], sub[6]);
  }

}




