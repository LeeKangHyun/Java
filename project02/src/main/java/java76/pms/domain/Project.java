package java76.pms.domain;

import java.sql.Date;

public class Project {
  protected String  title;
  protected Date    startDate;
  protected Date    endDate;
  protected String  member;
  
  void setValue(String str) {
    String[] tokens = str.split(",");
    if (tokens.length < 4)
      return;
    title = tokens[0];
    startDate = Date.valueOf(tokens[1]); // yyyy-MM-dd ---> Date 객체 
    endDate = Date.valueOf(tokens[2]);
    member = tokens[3];
  }
  
  public Project() {}
  
  public Project(String str) {
    this.setValue(str);
  }
  
  public Project(String title, Date startDate, Date endDate) {
    this.title = title;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  @Override
  public String toString() {
    return this.getTitle() + "," + this.getStartDate().toString() + "," +
            this.getEndDate().toString() + "," + this.getMember();
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public String getMember() {
    return member;
  }

  public void setMember(String member) {
    this.member = member;
  }
}
