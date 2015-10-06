package step07.ex04;

/*
 * 주제 : 메서드와 변수를 공개하자!
 * 
 * 공개범위
 * 1) public : 완전 공개
 * 2) protected : 같은 패키지에 있는 클래스나 다른 패키지라도 자식 클래스일 경우 접근 가능
 * 3) (default) : 같은 패키지에 있는 클래스에 대해서만 공개.
 * 4) private : 오직 그 클래스의 멤버만 접근 가능.
 */

public class Calculator2 {
  public int result; // 인스턴스 변수

  // 인스턴스 메서드
  public void plus(int a) {
    this.result += a;
  }
  
  public void minus(int a) {
    this.result -= a;
  }
}
