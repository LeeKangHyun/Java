package step11.ex02;

public class Truck extends Car {
  protected int weight;
  protected boolean dump;
  
  public Truck(int weight, boolean dump) {
    this.weight = weight;
    this.dump = dump;
  }
  
  public int getWeight() {
    return weight;
  }
  public void setWeight(int weight) {
    this.weight = weight;
  }
  public boolean isDump() {
    return dump;
  }
  public void setDump(boolean dump) {
    this.dump = dump;
  }
  
  @Override
  public void run() {
    System.out.println("부앙~~ 달린다.");
  }
}
