[주제: JSP 사용법]
1. Template Data와 서블릿 클래스
  - JSP 엔진은 .jsp 파일을 가지고 서블릿 클래스를 자동 생성한다.
  - 톰캣 임시 작업폴더/work/디렉토리
  - test01.jsp
  
2. Scriptlet
  - 2

3. Expression
  - 3

4. Declaration 태그의 사용
  - 4
  
5. 스크립트릿 에서 사용할 클래스를 임포트하기
  - 5 
  
6. JSP내장 변수 (built-in variables)
  - _jspService() 메서드 안에 공식적으로 선언된 변수.
  - JSP 엔진은 클래스를 자동 생성할 때 반드시 다음 변수를 _jspService() 메서드에
    선언해야 한다.
    request: HttpServletRequest
    response: HttpservletResponse
    pageContext: PageContext
    session: HttpSession
    application: ServletContext
    config: ServletConfig
    out: JspWriter
    page: Object
    error: Exception
    
* Whitespace: space, new line, tab
    




