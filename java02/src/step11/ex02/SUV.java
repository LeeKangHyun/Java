package step11.ex02;

public class SUV extends Car {
  protected boolean auto;
  protected boolean sunroof;
  
  public SUV(boolean auto, boolean sunroof) {
    this.auto = auto;
    this.sunroof = sunroof;
  }
  
  @Override
  public void run() {
    System.out.println("씽씽~~ 달린다.");
  }
  
  public boolean isAuto() {
    return auto;
  }
  public void setAuto(boolean auto) {
    this.auto = auto;
  }
  public boolean isSunroof() {
    return sunroof;
  }
  public void setSunroof(boolean sunroof) {
    this.sunroof = sunroof;
  }
  
  
}
