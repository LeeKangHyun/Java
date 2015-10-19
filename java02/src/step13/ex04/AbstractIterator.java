package step13.ex04;

// EvenIterator와 ReverseIterator 사이의 공통점을 뽑아서 슈퍼 클래스 정의
// 이 클래스의 직접 인스턴스를 만들어 사용할 일이 없다. => 추상 클래스로 선언
public abstract class AbstractIterator {
  // hasNext()와 next()는 어차피 하위 클래스에서 각각 구현해야 할 메서드 이다.
  // 슈퍼 클래스에 구현할 필요가 없다. 의미도 없다. => 추상 메서드로 선언.
  // 추상메서드로 선언하는 순간, 하위 클래스가 반드시 구현하도록 강제하는 효과를 가진다.
  public abstract boolean hasNext();
  public abstract Object next();
}
