package step03;

public class Computer {
  protected String model;
  protected String maker;
  protected int    ram;
  protected float  speed;

  public Computer() {}
  
  public Computer(String model, int ram) {
    System.out.println("Computer(String,int)");
    this.model = model;
    this.ram = ram;
  }
  
  public Computer(int ram, String maker) {
    System.out.println("Computer(int,String)");
    this.ram = ram;
    this.maker = maker;
  }
 
  @Override
  public String toString() {
    return "Computer [model=" + model + ", maker=" + maker + ", ram=" + ram + ", speed=" + speed + "]";
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
  
  public int getRam() {
    return ram;
  }

  public void setRam(int ram) {
    this.ram = ram;
  }

  public float getSpeed() {
    return speed;
  }

  public void setSpeed(float speed) {
    this.speed = speed;
  }
  
}
