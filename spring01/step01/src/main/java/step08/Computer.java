package step08;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class Computer {
  protected String   model;
  protected String   maker;
  protected int      ram;
  protected float    speed;
  protected Monitor  monitor;
  protected HDD      storage;
  protected Map<String,String> specs;

  @Override
  public String toString() {
    return "Computer [model=" + model + ", maker=" + maker 
        + ", ram=" + ram + ", speed=" + speed + ", monitor="
        + monitor + ", storage=" + storage + ", specs=" + specs + "]";
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
  @Autowired
  public void setMonitor(Monitor monitor) {
    System.out.println("setMonitor()");
    this.monitor = monitor;
  }
  public HDD getStorage() {
    return storage;
  }
  @Autowired
  public void setStorage(HDD storage) {
    System.out.println("setStorage()");
    this.storage = storage;
  }
  public Map<String, String> getSpecs() {
    return specs;
  }
  public void setSpecs(Map<String, String> specs) {
    this.specs = specs;
  }


}
