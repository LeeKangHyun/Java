package java76.cms.domain;

import java.io.Serializable;

public class Customer implements Serializable{
  private static final long serialVersionUID = 1L;

  protected String name;
  protected String password;
  protected String id;
  protected String address;
  protected String gender;
  protected int age;
  protected String photo;

  @Override
  public String toString() {
    return "Customer [name=" + name + ", password=" + password 
        + ", id=" + id + ", address=" + address + ", gender="
        + gender + ", age=" + age + ", photo=" + photo + "]";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  


}
