package v03;

import java.sql.Date;

public class Project {
  protected String  title;
  protected Date    startDate;
  protected Date    endDate;
  protected String  member;
  
  public Project() {}
  
  public Project(String title, Date startDate, Date endDate) {
    this.title = title;
    this.startDate = startDate;
    this.endDate = endDate;
  }

  @Override
  public String toString() {
    return "Project [title=" + title + ", startDate=" + startDate + ", endDate=" + endDate + ", member=" + member + "]";
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
