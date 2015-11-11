package step08;

import java.util.Date;

public class HDD {
  protected int   capacity;
  protected int   rpm;
  protected Date  createdDate;
  
  @Override
  public String toString() {
    return "HDD [capacity=" + capacity + ", rpm=" + rpm 
        + ", createdDate=" + createdDate + "]";
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
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }
  
  
  
}
