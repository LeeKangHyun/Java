/*
 * JVM의 메모리 관리: 가비지와 가비지 컬렉터
 * - 가비지(garbage)?
 *   => 인스턴스를 참조하는 레퍼런스가 없을 때
 *   => 가비지 컬렉터에 의해 메모리 해제
 * - 가비지 컬렉터(garbage collector)가 동작할 때
 *   => 메모리 부족
 *   => 시스템이 한가할 때
 * - 인스턴스 레퍼런스 관리
 *   => JVM이 레퍼런스 카운트를 관리한다.
 * - 메모리 자동 관리의 문제점?
 *   => 가비지를 죽시 삭제하지 않는다 => 일정 시간동안 메모리에 남아있다. => 비효율적인 사용
 *   => 해결책 : 가비지 생성을 최소화 하도록 프로그램 구조를 만들어야 한다. 
 *      방안1. Singleton 설계 기법
 *      방안2. Flyweight 설계 기법(Pooling 기법)
 */
package step08;

public class Exam03 {
  static class Student {
    String name;
    int age;
    boolean gender;
  }

  public static void main(String[] args) {
    Student s1, s2, s3;
    
    s1 = new Student(); // 100(1)
    s2 = new Student(); // 200(1)
    s3 = new Student(); // 300(1)
    
    Student s4 = s1;  // 100(2)
    Student s5 = s1;  // 100(3)
    s1 = s2;  // 200(2), 100(2)
    s3 = s1;  // 200(3), 300(0) => 300번지 인스턴스는 가비지가 되었다.
  }
}









