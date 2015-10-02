/* 
 * 주제: JVM 아규먼트
 */
package step05;

public class Exam17 {
  public static void main(String[] args) {
    // JVM 아규먼트
    // 문법) java -명령 .... 프로그램명
    
    // 1)  "-D" 명령
    // 이름=값 형태로 프로그램에게 값을 전달하고 싶을 때 사용한다.
    // 문법: java -D이름=값 -D이름=값 프로그램명
    // 예) java -Dname=hong -Dage=20 step05.Exam16
    //
    // -D 명령을 통해 전달된 값을 꺼내는 방법:
    // System.getProperty("이름");
    //
    
    System.out.println(System.getProperty("name"));
    System.out.println(System.getProperty("age"));
    
    // 2) "-classpath" 또는 "-cp"
    // 자바 패키지가 어떤 폴더에 있는지 지정하는 용도로 사용한다.
    // 지정하지 않으면 현재 폴더에서 찾는다.
    // 문법) java -classpath 폴더이름 프로그램명
    //      java -cp 폴더이름 프로그램명
    // 주의!
    // => 패키지 명을 지정하지 말라!
    // 정상: java -cp ./bin step05.Exam17
    // 오류: java -cp ./bin/step05 Exam17
    //
    // => 프로그램명은 반드시 패키지명과 클래스명을 모두 적어야 한다.
    // => 그래서 클래스 경로(classpath)를 지정할 때는 패키지가 있는 폴더까지만 지정해야 한다.
    //    절대로 패키지명을 지정해서는 안된다.
  }
}




