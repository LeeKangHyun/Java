package examweb.binder;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class GlobalBindingInitializer {
  private static final Logger logger = 
      Logger.getLogger(GlobalBindingInitializer.class); 
  
  @InitBinder 
  public void initBinder(WebDataBinder binder) {
    logger.debug("initBinder() 호출됨");

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    dateFormat.setLenient(false); 
    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
  }
}
