package step12.ex01;

import java.io.FileInputStream;
import java.util.Properties;

public class Test01 {

  public static void main(String[] args) throws Exception{
    // step12.ex01 패키지에 있는 test.properties 읽기
    Properties props = new Properties();
    
    // 파일 경로가 루트(/)로 시작하지 않는다면 상대 경로를 의미한다.
    // 이클립스에서 기본경로는 프로젝트 폴더이다.
    // 따라서 다음의 파일 경로는 프로젝트 폴더 밑에 있는 src를 가리킨다.
    props.load(new FileInputStream("src/step12/ex01/test.properties"));
    
    // 프로퍼티 파일을 읽은 후에 값 꺼내기
    System.out.println(props.getProperty("s01"));
    System.out.println(props.getProperty("s02"));
    
    // 키를 모를 때 값꺼내기
    // 1) key 목록을 얻는다.
    // 2) 반복문을 사용하여 각 key의 value를 꺼낸다.
    for (Object value : props.keySet()) {
      System.out.printf("%s=%s\n", value, props.getProperty((String)value));
    }
    
  }

}
