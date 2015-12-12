package java76.cms.domain;

import java.io.Serializable;

public class Customer implements Serializable{
  private static final long serialVersionUID = 1L;

  protected int no;
  protected int age;
  protected String name;
  protected String password;
  protected String id;
  protected String address;
  protected String gender;
  protected String photo;
  protected String nature;
  protected String ideal;
  @Override
  public String toString() {
    return "Customer [no=" + no + ", age=" + age + ", name=" 
  + name + ", password=" + password + ", id=" + id
        + ", address=" + address + ", gender=" + gender + ", photo=" 
  + photo + ", nature=" + nature + ", ideal=" + ideal
        + "]";
  }
  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
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
  public String getPhoto() {
    return photo;
  }
  public void setPhoto(String photo) {
    this.photo = photo;
  }
  public String getNature() {
    return nature;
  }
  public void setNature(String nature) {
    this.nature = nature;
  }
  public String getIdeal() {
    return ideal;
  }
  public void setIdeal(String ideal) {
    this.ideal = ideal;
  }
  
  
 
  


}
