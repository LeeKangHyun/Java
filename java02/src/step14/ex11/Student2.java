package step14.ex11;

import java.io.Serializable;

// 이 클래스에 대해 직렬화를 허락하노라!
public class Student2 implements Serializable {
  // 직렬화를 통해 내보내는 데이터가 어떤 버전인지 지정할 때 사용한다.
  // => 읽어들이는 쪽에서 이 버젼을 검사하여 읽을지 말 지 결정할 수 있다.
  // => 세밀하게 다룰 데이터가 아니라면 그냥 기본 값 1로 설정하라!
  private static final long serialVersionUID = 1L;
  
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









