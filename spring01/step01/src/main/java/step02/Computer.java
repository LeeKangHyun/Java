package step02;

public class Computer {
  protected String model;
  protected String maker;
  
  public Computer() {
    System.out.println("Computer()");
  }
  
  public Computer(String model) {
    System.out.println("Computer(model");
  }
  
  public Computer(String model, String maker) {
    System.out.println("Computer(model, maker)");
  }
  
  @Override
  public String toString() {
    return "Computer [model=" + model + ", maker=" + maker + "]";
  }
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }
  public String getMaker() {
    return maker;
  }
  public void setMaker(String maker) {
    this.maker = maker;
  }
  
}
