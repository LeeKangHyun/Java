package step07.ex15;

public class Customer2 {
  private String  name;
  private boolean gender;
  private int     age;
  private float   height;
  private float   weight;
  private float   fatRate;

  @Override
  public String toString() {
    return "Customer [name=" + name + ", gender=" + gender + ", age=" + age + ", height=" + height + ", weight="
        + weight + ", fatRate=" + fatRate + "]";
  }
  // 인스턴스의 값을 넣는 메서드 제공
  // => set으로 메서드 이름을 시작한다.
  // => 셋터(setter) 메서드라 부른다.

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name == null)
      this.name = "홍길동";
    else
      this.name = name;
  }

  public boolean isGender() {
    return gender;
  }

  public void setGender(boolean gender) {
    this.gender = gender;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age > 13 && age < 100)
      this.age = age;
    else
      this.age = 30;
  }

  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {
    if (height > 0 && height < 200)
      this.height = height;
    else 
      this.height = 170;
  }

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    if (weight > 0 && weight < 200)
      this.weight = weight;
    else
      this.weight = 65;
  }

  public float getFatRate() {
    return fatRate;
  }

  public void setFatRate(float fatRate) {
    if (fatRate > 0 && fatRate < 70)
      this.fatRate = fatRate;
    else
      this.fatRate = 25;
  }
}
