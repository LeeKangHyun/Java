[주제: 이클립스의 WTP(Web Tool Plugin)을 사용하여 웹 애플리케이션 자동 배치하기]
1. 톰캣 서버에 대해 작업용 디렉토리를 만든다.
   => 먼저 이클립스에 톰캣 설치 폴더의 위치를 알려준다.
   => 톰캣 원본 설정 파일을 복사해 온다.
   => 배치하고 테스트하기 위한 임시 작업 폴더를 생성한다.
   => 이점: 원본 톰캣 서버를 손대지 않고 여러 개의 작업용 서버를 구축할 수 있다.
   => eclipse/Servers 뷰를 띄워라.(JavaEE 퍼스펙티브를 선택하면 해당 뷰가 존재한다.)

2. 서버를 실행한다.

3. 자바 프로젝트(web01)에 웹 설정 파일을 추가한다.
  => build.gradle 파일에 웹 프로젝트 관련 설정을 추가한다.
  => Gradle build...>eclipse 실행

4. 웹 프로젝트는 톰캣 작업 폴더에 배치한다.
  => Servers 뷰 > add and remove... 메뉴 > 웹 프로젝트 추가 후 "Finish" 클릭
  
5. 톰캣 작업 폴더에 대해 서버를 시작한다.
  => Servers 뷰 > start 메뉴

6. 톰캣 작업 폴더는 어디에?
  => 이클립스워크스페이스폴더/.metadata/.plugins/org.eclipse.wst.server.core/tmp0
   배치 폴더는 어디에?
  => tmp0/wtpwebapps/
=> MacOSX의 Finder는 기본으로 .으로 시작하는 이름을 가진 폴더를 출력하지 않는다.
   숨김 파일(디렉토리)를 보이게 하는 방법?
   defaults write com.apple.finder AppleShowAllFiles -boolean true ; killall Finder








