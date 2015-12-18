package examweb.domain;

import java.util.Date;

public class Member {
  String  name;
  int     age;
  Date    joinDate;
  
  @Override
  public String toString() {
    return "Member [name=" + name + ", age=" + age + ", joinDate=" + joinDate + "]";
  }
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public Date getJoinDate() {
    return joinDate;
  }
  public void setJoinDate(Date joinDate) {
    this.joinDate = joinDate;
  }
  
  
  
}
