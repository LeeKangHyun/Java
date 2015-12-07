package step04;

public class Computer {
  protected String  model;
  protected String  maker;
  protected int     ram;
  protected float   speed;
  protected Monitor monitor;

  @Override
  public String toString() {
    return "Computer [model=" + model + ", maker=" 
        + maker + ", ram=" + ram + ", speed=" + speed + ", monitor="
        + monitor + "]";
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

  public Monitor getMonitor() {
    return monitor;
  }

  public void setMonitor(Monitor monitor) {
    this.monitor = monitor;
  }


}
