package BMS.domain;

import java.io.Serializable;

public class Book implements Serializable {
  private static final long serialVersionUID = 1L;

  protected int no;
  protected String title;
  protected String authors;
  protected String press;
  protected String tag;
  protected boolean rent;
  
  public Book() {}
  
  @Override
  public String toString() {
    return "Book [no=" + no + ", title=" + title 
        + ", authors=" + authors + ", press=" + press + ", tag=" + tag
        + ", rent=" + rent + "]";
  }

  public int getNo() {
    return no;
  }

  public void setNo(int no) {
    this.no = no;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthors() {
    return authors;
  }

  public void setAuthors(String authors) {
    this.authors = authors;
  }

  public String getPress() {
    return press;
  }

  public void setPress(String press) {
    this.press = press;
  }

  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public boolean isRent() {
    return rent;
  }

  public void setRent(boolean rent) {
    this.rent = rent;
  }


}
