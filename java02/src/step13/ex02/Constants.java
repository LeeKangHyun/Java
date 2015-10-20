package step13.ex02;

public class Constants {
  // top level inner class
  // => 다음 클래스들은 상수 값을 분류하는 역할을 한다.
  // => 상수 값을 사용할 때, 프로퍼티의 값을 사용하는 것처럼 꾸미기 위하여
  //    클래스 이름을 소문자로 하기도 한다.
  //    예) 안드로이드 R.java 참고!
  static class location {
    public static final String KANGNAM = "강남교육장";
    public static final String JONGRO = "종로교육장";
    public static final String BUSAN = "부산교육장";
    public static final String KWANGJU = "광주교육장";
    public static final String DAEJUN = "대전교육장";
  }

  static class working {
    public static final int WORK = 1;
    public static final int NOT_WORK = 2;
    public static final int REWORK = 3;
  }

  static class subject {
    public static final int JAVA = 1;
    public static final int C = 2;
    public static final int ANDROID = 3;
    public static final int PYTHON = 4;
    public static final int WINDOW = 5;
  }
}
