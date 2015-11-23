/* 클라이언트로 출력하기
=> 멀티바이트 문자의 깨짐 현상
이유:
- getWriter()가 리턴한 출력스트림은 기본으로 유니코드를 ISO-8859-1로 바꿔서 출력한다.
  만약 유니코드 문자가 ISO-8859-1(ISO-latin-1) 문자표에 들어있지 않다면,
  물음표(?)를 대신 출력한다.
  
해결책:
- 출력 스트림을 얻기 전에 어떤 문자표를 사용할 것인지 지정하라! 
*/ 
package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet04 extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest request, ServletResponse response) 
      throws ServletException, IOException {
    //0) 출력 스트림이 사용할 문자표 지정
    //- 유니코드를 UTF-8 문자표에 등록된 코드로 바꿔서 출력하라!
    response.setContentType("text/plain;charset=UTF-8");
    
    //1) 출력 스트림 객체를 얻는다.
    PrintWriter out = response.getWriter();
    
    //2) 출력한다.
    out.println("Hello, World!");
    out.println("안녕하세요!");
    out.println("おはよう");
    out.println("你好");
    
  }
 
}

/* text/plain?
 * => MIME(Multi-purpose Internet Mail Extension) 타입이다.
 * => 보내는 메일의 콘텐츠 유형을 정의하기 위해 만든 문법.
 * => 상대 편에게 메일의 유형을 알려줌으로써
 *    그 메일을 읽는 쪽에서는 그 유형에 적합한 프로그램을 실행하여 출력할 것이다.
 * => MIME에 정의된 타입을 웹에서도 가져다 사용한다. 
 */








