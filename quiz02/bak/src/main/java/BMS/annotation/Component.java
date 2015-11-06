package BMS.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 자동으로 관리할 객체를 표시하는 용도
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
  String value() default ""; 
}
