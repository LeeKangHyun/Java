package examweb.domain;

public class Board {
  protected int     no;
  protected String  title;
  protected String  content;
  
  public int getNo() {
    return no;
  }
  public Board setNo(int no) {
    this.no = no;
    return this;
  }
  public String getTitle() {
    return title;
  }
  public Board setTitle(String title) {
    this.title = title;
    return this;
  }
  public String getContent() {
    return content;
  }
  public Board setContent(String content) {
    this.content = content;
    return this;
  }
  
  
}
