package java76.cms.domain;

import java.util.Date;

public class Message {
  protected int no;
  protected String dearid;  //받는이
  protected String byid;    //보낸이
  protected String content;
  protected Date createdate;
  
  public int getNo() {
    return no;
  }
	
  public void setNo(int no) {
    this.no = no;
  }
	
  public String getDearid() {
    return dearid;
  }
  
  public void setDearid(String dearid) {
	  this.dearid = dearid;
  }
  
	public String getByid() {
		return byid;
	}
	
	public void setByid(String byid) {
		this.byid = byid;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public Date getCreatedate() {
		return createdate;
	}
	
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
  
}
