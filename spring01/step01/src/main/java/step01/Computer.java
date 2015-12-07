package step01;

public class Computer {
  protected String model;
  protected String maker;
  
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
