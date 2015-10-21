package step14.ex04;

import java.io.FileWriter;

public class Test01_out {

  public static void main(String[] args) throws Exception {
    FileWriter out = new FileWriter("./test/ex04.test01.txt");
    
    // write(int) 
    // => 마지막 2 바이트를 읽어서 JVM 기본 문자집합으로 인코딩 한다.
    // => FileWriter는 2바이트 단위로 데이터를 다룬다.
    //    이유? 문자 단위가 2바이트 이기 때문이다.
    // => FileWriter는 문자 단위로 데이터를 다룬다.
    out.write(0xaabbccdd);  // 4바이트 중에서 맨 뒤의 2바이트를 유니코드로 간주하고 다룬다.
    out.write(0xaabb0041);  // => 0041(A) 즉 유니코드 대문자 'A'를 출력한다.
    out.write(0xaabbAC00);  // => AC00(가) 즉 유니코드 '가'를 출력한다.
    // 출력할 때 자동으로 UTF-8로 인코딩한다.
    // FileOutputStream의 write()는 자동으로 인코딩 하지 않았다.
    // FileWriter는 문자 출력을 다루는 도구라서 자동으로 UTF-8로 인코딩 한다.
    // (물론, JVM의 기본 문자 집합이 UTF-8이라고 가정하자.)
    // (JVM의 기본 문자 집합이 MS949면 당연히 유니코드를 MS949로 인코딩할 것이다.
    
    // write(char[])
    // char[] chars = new char[]{'H', 'e', 'l', 'l', 'o'};
    char[] chars = {'H', 'e', 'l', 'l', 'o', '똘', '똥', '똠'}; // new char[] 생략가능
    out.write(chars); // 배열 전체를 출력한다. Unicode --> UTF-8로 변환
    
    // 주의!
    // 그림, 음성, 동영상 등 바이너리 데이터는 FileWriter를 사용하여 출력하지 말라!
    // FileWriter는 항상 출력하는 데이터가 문자라고 간주하고, 
    // 출력할 때 JVM 기본 문자집합으로 변환한다. 
    
    out.close();
    System.out.println("실행 완료!");

  }

}
