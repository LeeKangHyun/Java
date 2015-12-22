[주제: AJAX와 JSON 적용]
0. AJAX, JSON 사용을 위한 준비 
  - build.gradle 파일에 jackson-databind 라이브러리 추가
    => compile 'com.fasterxml.jackson.core:jackson-databind:2.6.4'
  - 스프링 WebMVC 설정 파일에 ContentNegotiatingViewResolver 적용
  <bean class="org.springframework.web.servlet.view.ContentNegotiatingViewResolver">
    <property name="viewResolvers">
      <list>
        <bean class="org.springframework.web.servlet.view.BeanNameViewResolver"/>
        <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
          <property name="viewClass" value="org.springframework.web.servlet.view.JstlView"/>
          <property name="prefix" value="/WEB-INF/jsp/"/>
          <property name="suffix" value=".jsp"/>
        </bean>
      </list>
    </property>
    <property name="defaultViews">
      <list>
        <bean class="org.springframework.web.servlet.view.json.MappingJackson2JsonView"/>
      </list>
    </property>
  </bean>  
  
1. 게시판 UI 작성
  - /webapp/board/index.html
  - /webapp/board/form.html
  
2. 게시판 페이지 컨트롤러 작성
  - *.controller.ajax.BoardController.java 
  
=> 기존 코드 백업: index01.html, form01.html

[주제: 코드 재사용성 높이기]
1. 엘리먼트 찾는 코드를 함수로 만들기
  - BIT 자바스크립트 라이브러리 생성: webapp/js/bit.js
  - bit() {}

=> 기존 코드 백업: index02.html, form02.html, bit02.js
  
2. bit() 함수를 최소 이름의 변수에 저장하기 
  
  - $ 변수를 만들고 bit() 함수의 주소를 저장한다.
  - 기존 코드에서 bit() 호출을 $()로 변경한다.
  
3. 이벤트를 등록하는 함수를 만든다.
  - IE8 이하에서도 사용할 수 있는 함수.
  - click() 함수 추가
  
4. 폼 입력 항목의 값을 설정하는 함수를 만든다.
  - val() 함수 추가
  
5. 엘리먼트 만드는 함수를 만든다.
  - bit() 함수 변경  
  
6. innerHTML, textContent를 설정할 함수를 만든다.
  - innerHTML -> html()
  - textContent -> text()  

7. 자식 엘리먼트를 추가하는 함수 만든다.
  - append()  
  
=> 기존 코드 백업: index03.html, form03.html, bit03.js  
  
8. AJAX 함수 만든다.
  - ajax()
 
=> 기존 코드 백업: index04.html, form04.html

9. 기본의 bit.js 라이브러리를 jQuery 라이브러리로 대체한다.
10. bootstrap 적용하기 
