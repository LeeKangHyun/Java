package step07;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

public class MyPropertyEditorRegistrar implements PropertyEditorRegistrar {
  DatePropertyEditor datePropertyEditor;
  
  public void setDatePropertyEditor(DatePropertyEditor datePropertyEditor) {
    this.datePropertyEditor = datePropertyEditor;
  }

  @Override
  public void registerCustomEditors(PropertyEditorRegistry registry) {
    registry.registerCustomEditor(
        java.util.Date.class, datePropertyEditor);
  }
}
