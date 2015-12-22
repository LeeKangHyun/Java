[주제: 프론트 엔드 패키지 관리자 도입]
- bower 패키지 관리자 도입 

1. nodejs 설치
2. bower 설치
  - 윈도 : npm install -g bower
  - 맥OSX: sudo npm install -g bower
3. 프로젝트 폴더로 웹 프론트엔드 라이브러리 가져오기.
  - 가져온 라이브러리는 bower를 실행한 하위 폴더 "bower-components"에 저장된다.
  1) 폴더로 jquery 라이브러리 가져온다.
    - 최신 버전 라이브러리 가져오기 
      ==> bower install jquery  
    - 특정 버전의 라이브러리 가져오기
      ==> bower install jquery#버전 
      ==> 예) bower install jquery#1.11.3
  2) bootstrap 라이브러리 가져온다.    
    - bower install bootstrap
    
4. 라이브러리를 개별적으로 가져오기 말고 한 번에 가져오기.
  1) bower 설정 파일을 작성한다.
    ==> bower init 명령을 사용하여 bower 매니페스트 파일(bower.json) 만들기 
    ==> bower.json 파일을 작성할 때 현재 bower_components 폴더에 다운 받은
        라이브러리가 의존 라이브러리 목록에 자동으로 추가된다.
  2) 배포하기 
    ==> 다른 사람에게 프로젝트를 줄 때는 gradle과 같이 bower_components 폴더를 지워라.
  3) 가져오기
    ==> 프로젝트를 가져왔다면 "bower install"을 실행하여 웹 프론트엔드 라이브러리를 
        가져와라. 이때 라이브러리를 지정하지 말라!
    ==> bower install을 실행하는 폴더에 bower.json 파일이 있다면,
        그 파일에 설정된 내용에 따라 의존 라이브러리를 자동으로 가져온다.       

5. bower에서 가져온 라이브러리 파일을 특정 폴더(예: webapp)에 배치하기 
  1) bower-installer 설치 
    ==> npm install -g bower-installer
  2) bower 매니페스트 파일(bower.json)에 배치 정보를 넣는다.
    "install" : {
      "path" : "예)src/main/webapp"
    }
  3) 배치하기 
    ==> bower-installer 실행
    ==> bower-installer는 라이브러리 폴더에서 파일을 가져올 때
        각 라이브러리 매니페스트 파일에서 main 만 배치한다.
        만약 그 라이브러리의 다른 파일도 배치하고 싶다면,
        install 설정에 main 파일 정보를 재정의하라!
    "install" : {
      "path" : "src/main/webapp/lib",
      "sources": {
        "bootstrap": "bower_components/bootstrap/dist/**",
        "jquery": "bower_components/jquery/dist/**"
      }
    }     



