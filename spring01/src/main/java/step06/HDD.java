package step06;

public class HDD {
  protected int capacity;
  protected int rpm;
  
  @Override
  public String toString() {
    return "HDD [capacity=" + capacity + ", rpm=" + rpm + "]";
  }
  
  public int getCapacity() {
    return capacity;
  }
  
  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }
  
  public int getRpm() {
    return rpm;
  }
  
  public void setRpm(int rpm) {
    this.rpm = rpm;
  }
  
  
}
