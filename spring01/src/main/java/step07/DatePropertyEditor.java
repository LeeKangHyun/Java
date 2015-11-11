package step07;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePropertyEditor extends PropertyEditorSupport {
  SimpleDateFormat dateFormat;
  
  public DatePropertyEditor() {
    dateFormat = new SimpleDateFormat("yyyy-MM-dd");
  }
  
  @Override
  public void setAsText(String text) throws IllegalArgumentException {
    try {
    // 1) Text --> java.util.Date
    Date date = dateFormat.parse(text);
    
    // 2) 변환된 객체를 저장
    this.setValue(date);
    
    } catch (Exception e) {
      throw new IllegalArgumentException(e);
    }
  }
}
