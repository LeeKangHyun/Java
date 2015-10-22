package v07;

import java.sql.Date;

public class Board {
    protected int no;
    protected String title;
    protected Date createdDate;
    protected String content;
    protected String writer;
    
    void setValue(String str) {
      String[] tokens = str.split(",");
      if (tokens.length < 4)
        return;
      title = tokens[0];
      content = tokens[1];
      createdDate = Date.valueOf(tokens[2]);
      writer = tokens[3];
    }
    
    public Board() {}
    
    public Board(String str) {
      this.setValue(str);
      
    }
    
    @Override
    public String toString() {
      return "Board [no=" + no + ", title=" + title + "]";
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

    public Date getCreatedDate() {
      return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
      this.createdDate = createdDate;
    }

    public String getContent() {
      return content;
    }

    public void setContent(String content) {
      this.content = content;
    }

    public String getWriter() {
      return writer;
    }

    public void setWriter(String writer) {
      this.writer = writer;
    }
    
}
