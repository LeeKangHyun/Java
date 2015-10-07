package step07.ex15;

public class Customer {
  String  name;
  boolean gender;
  int     age;
  float   height;
  float   weight;
  float   fatRate;
  
  @Override
  public String toString() {
    return "Customer [name=" + name + ", gender=" + gender + ", age=" + age + ", height=" + height + ", weight="
        + weight + ", fatRate=" + fatRate + "]";
  }
  
}
