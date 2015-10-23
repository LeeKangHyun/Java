[주제: 파일 입출력]
스트리밍의 개념(설명)

ex01 - File
  => 파일 정보 다루기
  => 디렉토리 정보 다루기

ex02 - File
  => 하위 파일 목록 다루기
  => FileFilter 구현하기 + 익명 이너 클래스 사용  

ex03 - FileOutputStream, FileInputStream
  => 데이터 출력하기
  => 데이터 읽기
  
ex04 - FileWriter, FileReader
  => 데이터 출력하기, 데이터 읽기
  => byte stream과 character stream의 차이점 비교.
  => 입/출력 클래스 분류
     1) byte / character
     2) data sink / data processing
     
ex05 - primitive type 데이터 입/출력하기 
  => 문자열과 int 값 출력하기 
  => 상속을 이용하여 primitive type 데이터를 읽는 기능 추가하기  

ex06 - caching 기법 
  => 버퍼를 활용하여 파일 읽기 속도를 높이자!
  
ex07 - ex05 + ex06 
  => 상속을 이용하여 DataInputStream에 버퍼 기능 넣기.
  => 자바는 다중 상속을 지원하지 않기 때문에 다른 클래스의 기능은 복사&붙여넣기로 처리해야 한다.
     => 상속의 한계
  => 버퍼를 사용할 때 flush()와 close()의 유용함 확인!  

ex08 - 기능 확장을 할 때 상속 대신 위임 방식을 이용한다.
  => 상속 보다는 덜 경직된 구조이다. 
  => 상속 보다 더 유연한 구조이다.
  => 두 클래스이 기능 결합? 상속과 마찬가지로 해결이 쉽지 않다.
   
ex09 - Decorator 패턴을 적용하여 객체 간의 연결을 쉽게 한다.
  => 상속을 통한 경직된 방식의 기능 확장 대신,
     좀 더 유연하게 기능을 확장할 수 있도록 구조를 변경한다.   
     
ex10 - 자바에서 제공하는 API를 사용하여 입출력하기.

ex11 - 객체 직렬화(Serialization)
  => serialize: 인스턴스 ---> 바이트 배열    (marshaling)
  => deserialize: 바이트 배열 ---> 인스턴스  (unmarshaling)
  => transient 제한자(변경자; modifier)의 활용

  
  
  
  