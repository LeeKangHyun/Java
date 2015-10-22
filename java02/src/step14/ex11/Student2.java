package step14.ex11;

import java.io.Serializable;

// 이 클래스에 대해 직렬화를 허락하노라!
public class Student2 implements Serializable {
  protected String name;
  protected String email;
  protected String tel;
  protected String cid;
  protected int    age;
  protected boolean working;
  
    @Override
  public String toString() {
    return "Student [name=" + name + ", email=" + email + ", tel=" + tel + ", cid=" + cid + ", age=" + age
        + ", working=" + working + "]";
  }
    
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }
  public String getCid() {
    return cid;
  }
  public void setCid(String cid) {
    this.cid = cid;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public boolean isWorking() {
    return working;
  }
  public void setWorking(boolean working) {
    this.working = working;
  }
  
  
  
}









