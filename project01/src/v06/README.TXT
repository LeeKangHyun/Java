작업목표: .properties 파일 읽기, Reflection API를 이용한 인스턴스 자동 생성
.properties 파일?
- key = value이 한 줄로 작성된 파일.
- 속성 정보를 저장할 때 사용.
- java.util.Properties 클래스를 이용하여 파일을 읽는다.

리플렉션 API?
- 거울처럼 클래스의 내부 사항을 보여주는 기능을 해서 reflection API라고 부른다.
- 클래스의 정보를 추출하고(Class), 메서드 정보를 추출하고(Method), 
  필드 정보를 추출하는(Field) 등의 작업을 수행한다.

실습 : 
1. 각 기능을 처리하는 클래스 정보를 menu.Properties 파일에 저장한다.
2. ProjectApp에서 menu.properties 파일을 읽는다.
3. 프로퍼티 파일에 등록된 대로 클래스의 인스턴스를 생성하여 맵에 담는다. 
4. 변경된 구조에 맞춰 게시판 기능을 추가한다. 
   - menu.properties 파일에 새 기능을 처리할 클래스 정보를 등록한다.
   - 게시물 데이터를 저장할 사용자 정의 데이터 타입을 추가한다. => Board 클래스 추가.
   - v06.BoardControl 클래스를 작성한다.
   - 게시판 각 메뉴(Command)는 생략!
   - ProjectApp에 기능 추가!



