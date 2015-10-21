package step14.ex05;

import java.io.FileOutputStream;

public class Test02_out {
  public static void main(String[] args) throws Exception {
    // primitive type 데이터 출력하기
    FileOutputStream out = new FileOutputStream("./test/ex05.test02.dat");

    // 성적 데이터 출력하기
    String name = "홍길동";
    int kor = 100;    // 0x 0000 0064
    int eng = 90;     // 0x 0000 005A
    int math = 80;    // 0x 0000 0050

    // 이름 국어 영어 수학 순서로 출력하시오.
    
    // 출력 형식(File Format) 정의
    // 2바이트 문자열 크기
    // 문자열 바이트
    // 4바이트 국어 점수
    // 4바이트 영어 점수
    // 4바이트 수학 점수
    
    byte[] bytes = name.getBytes();
    // 1) 문자열 크기 출력
    out.write(bytes.length >> 8);
    out.write(bytes.length);
    
    // 2) 문자열 바이트 출력
    out.write(bytes);
    
    // 3) 국어 점수 출력
    out.write(name.getBytes());
    out.write(kor >> 24);
    out.write(kor >> 16);
    out.write(kor >> 8);
    out.write(kor);
    
    // 4) 영어 점수 출력
    out.write(eng >> 24);
    out.write(eng >> 16);
    out.write(eng >> 8);
    out.write(eng);
    
    // 5) 수학 점수 출력
    out.write(math >> 24);
    out.write(math >> 16);
    out.write(math >> 8);
    out.write(math);
    
    out.close();
  }
}
