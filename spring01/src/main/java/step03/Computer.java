package step03;

import org.springframework.stereotype.Component;

@Component
public class Computer {
  protected String model;
  protected String maker;
  
  public Computer() {
    System.out.println("Computer()...");
  }
  
  @Override
  public String toString() {
    return "Computer [model=" + model + ", maker=" + maker + "]";
  }
  
  public String getModel() {
    System.out.println("getModel()...");
    return model;
  }
  public void setModel(String model) {
    System.out.println("setModel()...");
    this.model = model;
  }
  public String getMaker() {
    System.out.println("getMaker()...");
    return maker;
  }
  public void setMaker(String maker) {
    System.out.println("setMaker()...");
    this.maker = maker;
  }
  
  
}
