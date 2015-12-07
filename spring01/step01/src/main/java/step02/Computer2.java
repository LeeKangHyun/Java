package step02;

public class Computer2 {
  protected String model;
  protected String maker;
  protected int    ram;
  protected float  speed;

  public Computer2() {
    System.out.println("Computer()");
  }
  
  public Computer2(String model) {
    System.out.println("Computer(model)");
    this.model = model;
  }
  
  public Computer2(String model, String maker) {
    System.out.println("Computer(model, maker)");
    this.model = model;
    this.maker = maker;
  }
  
  public Computer2(String model, int ram) {
    System.out.println("Computer(String,int)");
    this.model = model;
    this.ram = ram;
  }
  
  public Computer2(String model, float speed) {
    System.out.println("Computer(String,float)");
    this.model = model;
    this.speed = speed;
  }
  
  public Computer2(int ram) {
    System.out.println("Computer(int)");
    this.ram = ram;
  }
  
  public Computer2(float speed) {
    System.out.println("Computer(float)");
    this.speed = speed;
  }
 
  @Override
  public String toString() {
    return "Computer2 [model=" + model + ", maker=" + maker + ", ram=" + ram + ", speed=" + speed + "]";
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
