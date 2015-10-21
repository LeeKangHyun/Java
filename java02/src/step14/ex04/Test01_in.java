package step14.ex04;

import java.io.FileInputStream;
import java.io.FileReader;

public class Test01_in {
  public static void main(String[] args) throws Exception {
    // FileReader와 FileInputStream
    FileInputStream in = new FileInputStream("./test/ex04.test01.txt");

    System.out.printf("%04x\n", in.read());
    System.out.printf("%04x\n", in.read());
    System.out.printf("%04x\n", in.read());
    in.close();
    
    // FileInputStream의 read()
    // => 데이터의 저장 형식에 상관없이 무조건 1바이트만 읽는다.
    // => 읽은 값 그대로 리턴한다.
    
    System.out.println("--------------------------------");
    
    FileReader in2 = new FileReader("./test/ex04.test01.txt");
    
    System.out.printf("%04x\n", in2.read());  //ecb39d(UTF-8) --> ccdd(Unicode)
    System.out.printf("%04x\n", in2.read());
    System.out.printf("%04x\n", in2.read());
    in2.close();
    
    // FileReader의 read()
    // => 읽은 데이터를 문자라고 간주하고 유니코드로 바꾼다.
    // => 읽을 때 UTF-8(JVM 기본 문자집합)의 규칙에 따라 읽는다.
    //    규칙? 영어는 1바이트, 한글은 3바이트.
    
    // 바이너리 데이터를 다룰 때는 FileInputStream/FileOutputStream 도구를 사용하라!
    // 캐릭터 데이터를 다룰 때는 FileReader/FileWriter 도구를 사용하라!
    
    // 바이너리 데이터?
    // => 텍스트 에디터로 편집할 수 없는 데이터.
    // => 전용 편집기가 필요한 데이터.
    // => .xls, .doc, .ppt, .jpg, .class
    //
    // 문 데이터?
    // => 텍스트 에디터로 편집 가능
    // => .txt, .html, .css, .js, .php, .py, .vbs, .rtf
  }
}









