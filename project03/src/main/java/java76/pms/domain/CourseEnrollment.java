package java76.pms.domain;

import java.sql.Date;

public class CourseEnrollment {
  public static final int STATUS_WAIT = 0;
  public static final int STATUS_REJECT = 1;
  public static final int STATUS_ALLOW = 2;
  
  protected String    email;
  protected String    name;
  protected String    tel;
  protected int       status;
  protected Date      registeredDate;
  
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }
  public int getStatus() {
    return status;
  }
  public void setStatus(int status) {
    this.status = status;
  }
  public Date getRegisteredDate() {
    return registeredDate;
  }
  public void setRegisteredDate(Date registeredDate) {
    this.registeredDate = registeredDate;
  }
  
  
  
}
