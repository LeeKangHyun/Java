package step07;

import java.beans.PropertyEditorSupport;

public class HDDPropertyEditor extends PropertyEditorSupport {
  
  @Override
  public void setAsText(String text) throws IllegalArgumentException {
    try {
      HDD hdd = new HDD();
      
      String[] storage = text.split(",");
      
      hdd.setCapacity(Integer.parseInt(storage[0]));
      hdd.setRpm(Integer.parseInt(storage[1]));
      
      this.setValue(hdd);
      
    } catch (Exception e) {
      throw new IllegalArgumentException(e);
    }
  }
  
}
