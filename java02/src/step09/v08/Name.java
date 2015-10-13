package step09.v08;

import java.sql.Date;

public class Name {
  protected String Name;
  protected Date sDate;
  protected Date eDate;
  protected String mem;
  
  public Name() {}

  @Override
  public String toString() {
    return "Name [Name=" + Name + ", sDate=" + sDate + ", eDate=" + eDate + ", mem=" + mem + "]";
  }

  public Name(String Name, String mem)
  {
    this.Name = Name;
    this.mem = mem;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public Date getsDate() {
    return sDate;
  }

  public void setsDate(Date sDate) {
    this.sDate = sDate;
  }

  public Date geteDate() {
    return eDate;
  }

  public void seteDate(Date eDate) {
    this.eDate = eDate;
  }

  public String getMem() {
    return mem;
  }

  public void setMem(String mem) {
    this.mem = mem;
  }
  
}









