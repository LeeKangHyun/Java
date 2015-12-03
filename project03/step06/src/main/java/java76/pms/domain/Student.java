package java76.pms.domain;

public class Student {
  protected String photo;
  protected String name;
  protected String email;
  protected String tel;
  protected String cid; // class ID
  protected String password;

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Student() {}

  public Student(String name, String tel) {
    this.name = name;
    this.tel = tel;
  }

  @Override
  public String toString() {
    return "Student [photo=" + photo + ", name=" + name + ", email=" + email + ", tel=" + tel + ", cid=" + cid
        + ", password=" + password + "]";
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
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









