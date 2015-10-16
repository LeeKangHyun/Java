package v01;

// Bucket이 다루는 데이터의 타입을 E 라고 가정한다.
public class Bucket<E> {
  protected E         value;
  protected Bucket<E> next;
  
  public Bucket() {}
  
  public Bucket(E value) {
    this.value = value;
  }
  
  public Bucket(E value, Bucket<E> next) {
    this(value);
    this.next = next;
  }

  public E getValue() {
    return value;
  }

  public void setValue(E value) {
    this.value = value;
  }

  public Bucket<E> getNext() {
    return next;
  }

  public void setNext(Bucket<E> next) {
    this.next = next;
  }
}
