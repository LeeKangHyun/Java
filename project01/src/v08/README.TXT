작업목표: DAO(Data Access Object) 만들기
=> 데이터를 처리하는 기능을 별도의 클래스 분리한다.
=> DAO와 같은 클래스를 데이터 퍼시스턴스(persistence) 클래스라 부른다.
=> 데이터의 지속(저장 및 변경, 삭제, 로딩)을 관리한다.

실습:
1. Value Object 클래스를 별도의 패키지로 분류하자!
   domain(또는 dto, vo) 패키지 생성하여,
   Student와 Project 클래스를 이 패키지로 이동시킨다.
   
2. Control 클래스를 별도의 패키지로 분류하자.
   패키지명은 control로 한다.
   StudentControl, ProjectControl, BoardControl,
   MenuControl, StorageMenuCOntrol 클래스를 이 패키지로 이동시킨다.
   
3. DAO 클래스들을 담을 패키지를 준비한다.
   dao라는 패키지를 생성하라.
   
4. StudentControl로부터 프로젝트 데이터를 다루는(저장, 로딩) 기능을 분리하여
   StudentDao 클래스로 만든다. 
   








