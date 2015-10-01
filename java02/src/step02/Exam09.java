/*
 * 주제: 비트 연산자2 - 논리 연산자
 */
package step02;

public class Exam09 {

  public static void main(String[] args) {
    int i = 10;
    int j = 3;
    
    // 1) AND(&) 비트 연산자
    // - 일부 데이터를 0으로 막는다. (예: 그림의 일부 영역에 마스크를 씌움)
    System.out.println(Integer.toBinaryString(i & j));
    
    // 2) OR(|) 비트 연산자
    // - 일부 데이터를 1로 확장한다. (예: 색상을 더 밝게...)
    System.out.println(Integer.toBinaryString(i | j));
    
    // 3) 실무 사례
    // - 만약 자바76기의 일 출석 정보를 작성한다면 변수를 몇개 만들어야 할까?
    
    // 방법 1: 각 학생의 출석 여부를 저장할 변수를 만든다.
    boolean s1, s2, s3, s4, s5, s6, s7, s8;
    s1 = true;
    s1 = true;
    s1 = false;
    //...
    
    // 방법 2: 변수를 배열로 만든다.
    boolean[] s = new boolean[26];
    s[0] = true;
    s[1] = true;
    s[2] = false;
    //...
    
    // 방법 3: 단 1개의 4바이트 변수를 준비한다.
    int students = 0;
    //학생번호에 해당하는 비트 값이 1인 값을 OR 계산한다.
    students |= (int)Math.pow(2, 4);
    students |= (int)Math.pow(2, 13);
    System.out.println(Integer.toBinaryString(students));
    
    //특정 학생이 출석을 했는지 알고 싶다면 AND 계산한다.
    if ((students & (int)Math.pow(2, 12)) == 0) {
      System.out.println("결석");
    }
    else
      System.out.println("출석");
    
    //Exclusive OR(^) 연산자: 다른 데이터와 다른 경우  
    //                        특정 값으로 설정할 때 사용.크로마킹
    i = 10; // 00001010
    j = 3;  // 00000011
            //---------
            // 00001001
    
    System.out.println(Integer.toBinaryString(i ^ j));
    
    //NOT(~) 비연산자: 반전 효과에 주로 사
    i = 10; // 00001010
    System.out.println(Integer.toBinaryString(~i));
  }
}




