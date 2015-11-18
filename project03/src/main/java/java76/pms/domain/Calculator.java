package java76.pms.domain;

import java.io.Serializable;

public class Calculator implements Serializable {
  private static final long serialVersionUID = 1L;
  
  protected int v1;
  protected int v2;
  protected int result;
  protected String op;
  
  public Calculator() {}
  
  @Override
  public String toString() {
    return "Calculator [v1=" + v1 + ", v2=" + v2 + ", result=" + result + ", op=" + op + "]";
  }
  
  public int getV1() {
    return v1;
  }
  public void setV1(int v1) {
    this.v1 = v1;
  }
  public int getV2() {
    return v2;
  }
  public void setV2(int v2) {
    this.v2 = v2;
  }
  public int getResult() {
    return result;
  }
  public void setResult(int result) {
    this.result = result;
  }

  public String getOp() {
    return op;
  }

  public void setOp(String op) {
    this.op = op;
  }

  
}
