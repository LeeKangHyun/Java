package v11.server.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 자동으로 관리할 객체를 표시하는 용도
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
  String value() default ""; // 객체 이름. 예) Servlet의 명령어, Dao의 이름 등
                             // 객체를 저장할 떄 key로 사용한다.
}
