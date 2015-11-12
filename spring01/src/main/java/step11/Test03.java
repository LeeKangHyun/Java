package step11;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {
  static Logger logger = Logger.getLogger("okok");
  
  public static void main(String[] args) {
    // 1) Appender(출력 담당자) 지정
    // log4j.rootCategory=출력등급, 출력담당자 이름
    // 예) log4j.rootCategory=trace, stdout
    // 
    // 출력 담당자 이름
    // => 마음대로 짓는다.
    //
    // 2) 출력 담당자의 유형을 설정하기
    // 
    // log4j.appender.stdout=출력담당자의유형
    // 예) log4j.appender.stdout=org.apache.log4j.ConsoleAppender
    //
    // 출력 담당자의 유형
    // ConsoleAppender: 콘솔창으로 출력
    // FileAppender:    파일로 출력
    // SocketAppender:  네트워크로 출력
    // JDBCAppend:      DB로 출력
    // ...
    // 3) 출력 형식 선언
    // log4j.appender.출력담당자이.layout=출력형식
    // log4j.appender.stdout.layout=org.apache.log4j.PatternLayout
    //
    // 출력 형식?
    // SimpleLayout = 단순한 출력
    // HTMLLayout = HTML 태그로 출력
    // PatternLayout = 특정 패턴에 맞춰 출력
    // XMLLayout = XML 태그로 출력
    // 
    //
    // 4) PatternLayout의 패턴 지정
    // log4j.appender.stdout.layout.ConversionPattern=패턴
    // 예) log4j.appender.stdout.layout.ConversionPattern=%d{ABSOLUTE} %5p %t %c{2}:%L - %m%n
    // 
    // 패턴?
    // %패턴명령
    // 예) %5p %5t
    // 
    // 패턴 명령?
    // %n : 줄 바꿈
    // %p : 로깅 등급 이름
    // %5p : 출력 칸 수 지정
    // %m : 로그 메시지
    // %d{HH:mm:ss,SSS} : 날짜 및 시간 출력. 
    // 날짜 및 시간 형식은 java.text.SimpleDateFormat 클래스를 참조하라!
    // %t : 스레드 이름
    // %c : Logger의 카테고리 이름 출력.
    logger.fatal("fatal 레벨 로그....");
    logger.error("error 레벨 로그....");
    logger.warn("warn 레벨 로그....");
    logger.info("info 레벨 로그....");
    logger.debug("debug 레벨 로그....");
    logger.trace("trace 레벨 로그....");
    
    
  }
}
