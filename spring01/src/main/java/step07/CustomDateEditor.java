package step07;

import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

import org.springframework.util.StringUtils;

public class CustomDateEditor extends PropertyEditorSupport {

  private final DateFormat dateFormat;

  private final boolean allowEmpty;

  private final int exactDateLength;
  
  public CustomDateEditor(DateFormat dateFormat, boolean allowEmpty) {
    this.dateFormat = dateFormat;
    this.allowEmpty = allowEmpty;
    this.exactDateLength = -1;
  }
  
  public CustomDateEditor(DateFormat dateFormat, boolean allowEmpty, int exactDateLength) {
    this.dateFormat = dateFormat;
    this.allowEmpty = allowEmpty;
    this.exactDateLength = exactDateLength;
  }
  @Override
  public void setAsText(String text) throws IllegalArgumentException {
    if (this.allowEmpty && !StringUtils.hasText(text)) {
      // Treat empty String as null value.
      setValue(null);
    }
    else if (text != null && this.exactDateLength >= 0 && text.length() != this.exactDateLength) {
      throw new IllegalArgumentException(
          "Could not parse date: it is not exactly" + this.exactDateLength + "characters long");
    }
    else {
      try {
        setValue(this.dateFormat.parse(text));
      }
      catch (ParseException ex) {
        throw new IllegalArgumentException("Could not parse date: " + ex.getMessage(), ex);
      }
    }
  }
  
  @Override
  public String getAsText() {
    Date value = (Date) getValue();
    return (value != null ? this.dateFormat.format(value) : "");
  }

}