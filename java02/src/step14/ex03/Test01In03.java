package step14.ex03;

import java.io.FileInputStream;

public class Test01In03 {
  public static void main(String[] args) throws Exception{
    //FileInputStream 도구 사용법
    //=> 데이트럴 읽어 들일 때 사용하는 도구
    //=> 지정한 파일이 존재하지 않으면 예외 발생!.
    //=> 파일에 형식이 있다면, 읽어들일 때도 그 형식에 맞춰 읽어라!
    FileInputStream in = new FileInputStream("./test/ex03.test01.txt");

    // 3) 바이트 배열로 데이터를 읽어 오기
    // => 넉넉한 크기의 빈 배열을 준비한다.
    byte[] bytes = new byte[100];

    // => 읽은 바이트 수를 저장할 변수를 준비한다.
    int len = 0;
    
    // => 바이트 배열로 데이터를 읽는다.
    len = in.read(bytes); //  이 메서드의 리턴 값은 읽은 바이트 개수이다.
    
    for (int i = 0; i < len; i++)
      System.out.println(Integer.toHexString(bytes[i]));
    
    
    in.close();

    System.out.println("실행 완료!");
  }
}
