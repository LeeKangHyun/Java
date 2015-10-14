package step10.ex03;

public class Bucket {
  protected Object value;
  protected Bucket next;
  
  public Bucket() { }
  
  public Bucket(Object value) {
    this.value = value;
  }
  
  public Bucket(Object value, Bucket next) {
    this(value);
    this.next = next;
  }

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }

  public Bucket getNext() {
    return next;
  }

  public void setNext(Bucket next) {
    this.next = next;
  }
  
}
