package step06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

public class Computer {
  protected String   model;
  protected String   maker;
  protected int      ram;
  protected float    speed;
  protected ArrayList<Monitor> monitor;
  protected String[] options;
  protected Set<HDD> storage;
  protected Map<String,String> specs;





  @Override
  public String toString() {
    return "Computer [model=" + model + ", maker=" 
        + maker + ", ram=" + ram + ", speed=" + speed + ", monitor="
        + monitor + ", options=" + Arrays.toString(options) 
        + ", storage=" + storage + ", specs=" + specs + "]";
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

  public String[] getOptions() {
    return options;
  }

  public void setOptions(String[] options) {
    this.options = options;
  }

  public ArrayList<Monitor> getMonitor() {
    return monitor;
  }

  public void setMonitor(ArrayList<Monitor> monitor) {
    this.monitor = monitor;
  }

  public Set<HDD> getStorage() {
    return storage;
  }

  public void setStorage(Set<HDD> storage) {
    this.storage = storage;
  }

  public Map<String, String> getSpecs() {
    return specs;
  }

  public void setSpecs(Map<String, String> specs) {
    this.specs = specs;
  }


}
