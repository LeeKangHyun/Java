package v06;

public class Student {
  protected String name;
  protected String email;
  protected String tel;
  protected String cid; // class ID
  
  public Student() {}
 
  public Student(String name, String tel) {
    this.name = name;
    this.tel = tel;
  }
  
  @Override
  public String toString() {
    return "Student [name=" + name + ", email=" + email 
        + ", tel=" + tel + ", cid=" + cid + "]";
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
  
  
}









