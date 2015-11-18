1. JDK 설치
- 다운로드 및 설치

2. 초간단 자바 애플리케이션 개발 및 실행
1) 컴파일
   > 자바컴파일러 소스파일
   > javac.exe Hello.java
   > javac Hello.java     

* .exe 생략하면 윈도는 다음 순서로 파일을 찾는다.
- javac.com -> javac.exe -> javac.bat
   
* javac.exe를 실행하려면 그 파일이 있는 경로도 지정해야 한다.
   > "C:\Program Files\Java\jdk1.8.0_60\bin\javac.exe" Hello.java
   > "C:\Program Files\Java\jdk1.8.0_60\bin\javac" Hello.java

2) 바이트코드 실행
   > JVM프로그램 프로그램이름(.class는 입력하지 말 것)
   > "C:\Program Files\Java\jdk1.8.0_60\bin\java.exe" Hello

3. 자바 프로그램의 위치를 운영체제의 환경 변수에 등록하기 
- 어느 위치에서나 자바 프로그램(javac, java, ...)을 실행할 수 있다.
=> 파일탐색기 > 내컴퓨터 > 속성 > 고급시스템설정 > 고급탭 선택 > 환경변수 버튼 클릭
1) JAVA_HOME 환경변수 등록
   - JDK가 설치된 폴더
   - 자바 애플리케이션에서 자바 프로그램을 찾을 때 참조하는 변수
   - JAVA_HOME = C:\Program Files\Java\jdk1.8.0_60
2) PATH 환경변수에 bin 폴더 등록
   - 자바 프로그램(javac.exe, java.exe 등)을 찾을 때 참조하는 변수 
   - PATH = %JAVA_HOME%\bin;...

4. 이클립스 설치 및 실행
- www.eclipse.org 에서 다운로드 
- c:\javaide 에 압축을 푼다.
- 실행 -> workspace 폴더를 변경