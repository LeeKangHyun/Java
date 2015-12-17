package util;

import java.net.URLEncoder;

public class URLEncodingConverter {

  public static void main(String[] args) throws Exception {
    String str = "ABC가각간";
    
    // 문자열 ---> ASCII 코드로 변환
    // 0041 0042 0043 AC00 AC01 AC03 
    //   ---> 41 42 43 B0 A1 B0 A2 B0 A3   
    // 문자열을 EUC-KR로 바꿀 때, 영어는 그대로 둔다.
    // 한글은 7비트를 초과하기 때문에 ASCII 문자화(영문화)시킨다.
    // 즉 숫자를 영어 알파벳으로 바꾼다. <== URL 인코딩이다.\
    // 다음 코드를 보면 7비트를 초과하는 바이트를 찾을 수 없다.
    //   ---> 41 42 43 25 42 30 25 41 31 25 42 30 25 41 32 25 42 30 25 41 33 
    String urlencoding = URLEncoder.encode(str, "EUC-KR");
    System.out.printf("%s ---> %s\n", str, urlencoding);
    System.out.printf("%x", (int)'A');
    
    
  }

}
