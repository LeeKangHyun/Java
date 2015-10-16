[주제: 프로그래밍에 자주 사용되는 핵심 자료구조 구현]
ex01. Linked List 

ex02. - Stack = LIFO(Last In Fisrt Out)
      => 웹 브라우저나 파일 탐색기의 뒤로가기 기능 구현
      => 코딩 편집기에서 괄호를 검사할 때
      => JVM에서 메서드 호출을 관리할 때

ex03. - Queue = FIFO(First In Fisrt Out)
      => 프린트 출력 관리
      => 메시지 중계 시스템에서 메시지 전송할 때
      => 영화 예매 관리
      => 운영체제에서 이벤트를 관리할 때: 메시지 큐(Message Queue)  
      
[주제: 자바에서 제공하는 컬렉션 API 사용법] 
ex04. - java.util.HashMap
      => key-value 로 객체 목록을 관리한다.
      
ex05.Test01 - java.util.ArrayList
      => 데이터 목록을 다룰 때 사용한다.
      => 속도가 빠르다.
      => null 저장 가능
      => 순서대로 저장되고, 순서대로 꺼낼 수 있다.
      => 중복 값 저장 가능.
      
ex05.Test02 - java.util.HashSet
      => 순서대로 저장되지 않는다.
      => 중복값을 저장할 수 없다.
      => null저장 가능
      
ex05.Test03 - java.util.HashMap
      => 순서대로 저장되지 않는다.
      => 키가다르다면 중복 값을 저장 가능.
      => 키와 값으로 null허용.
      => 동기화를 지원 하지 않는다.
      => 다중 스레드에 대해 스레드 안전(thread-safe)을 지원 하지 않는다.
         =>다중 스레드 환경에 위험하다.
      => 동시에 여러 사람이 들락날락 거려도 상관 없는 경우, 주로 조회만 하는 경우.
         => 전시회.
      
ex05.Test04 - java.util.Hashtable
      => 순서대로 저장되지 않는다.
      => 키가 다르다면 중복 값을 저장 가능.
      => 키와 값으로 null을 사용할 수 없다.
      => 동기화 지원한다. 다중 스레드가 접근할 때 순차적으로 사용을 허락한다.
         => HashMap에 비해 속도가 느리다.
      => 동시에 여러 사람이 들어오면 문제가 되는 경우, 
         => 화장실 
      
[주제: 제네릭을 이용하여 저장 객체의 타입을 제한하기]
ex06.Test01 - ArrayList의 제네릭 사용
ex06.Test02 - HashMap의 제네릭 사용

[주제: HashMap에서 값을 꺼내는 다양한 방법]
ex07.Test01 - Entry로 key/value 목록을 꺼내기
ex07.Test02 - key목록을 꺼낸후, 그 key를 가지고 값을 꺼낸다.
ex07.Test03 - value 목록을 꺼내기

[주제: 목록에서 값을 꺼내는 방법을 객체화 시킨다 - Iterator 패턴]
=> 개발자는 값을 꺼내는 방법에 상관없이 일관된 방법으로 값을 꺼낼 수 있다.
1. 적용 전
ex08.Test01 - ArrayList에서 짝수 번째 값을 꺼내기
ex08.Test02 - ArrayList에서 뒤로부터 값을 꺼내기
ex08.Test03 - ArrayList에서 앞에서부터 값을 꺼내기
      
2. 적용 후

[주제: Bucket과 LinkedList에 제네릭 문법 사용]







      
