package step14.ex11;

import java.io.Serializable;

public class Score implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected String name;
  protected int    kor;
  protected int    eng;
  protected int    math;
  protected transient int    sum; // 직렬화 대상에서 제외한다.
  protected transient float  average; // 직렬화 대상에서 제외한다.
  
  @Override
  public String toString() {
    return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", average="
        + average + "]";
  }

  public void compute() {
    this.sum = this.kor + this.eng + this.math;
    this.average = this.sum / 3f;
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getKor() {
    return kor;
  }
  public void setKor(int kor) {
    this.kor = kor;
  }
  public int getEng() {
    return eng;
  }
  public void setEng(int eng) {
    this.eng = eng;
  }
  public int getMath() {
    return math;
  }
  public void setMath(int math) {
    this.math = math;
  }
  public int getSum() {
    return sum;
  }
  public void setSum(int sum) {
    this.sum = sum;
  }
  public float getAverage() {
    return average;
  }
  public void setAverage(float average) {
    this.average = average;
  }
  
  
}
