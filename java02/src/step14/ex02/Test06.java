package step14.ex02;

import java.io.File;

public class Test06 {
  public static void main(String[] args) throws Exception {
    // File 도구 사용법
    File file = new File("./bin");

    // 문제: 클래스 이름만 출력하라! 
    // => .class 확장자는 출력하지 않는다.
    // => 패키지명을 포함하라.
    // 예) step14.ex02.Test04 
    displayFiles("", file);
  }

  private static void displayFiles(String packageName, File file) throws Exception {
    File[] files = file.listFiles();
    String tmp = packageName; 
    if (packageName.length() > 0)
      tmp += ".";
    for (File f : files) {
      if (f.isFile()) {
        if (f.getName().endsWith(".class")) {
          System.out.println(tmp + f.getName().replace(".class", ""));
        }
      } else if (f.isDirectory()) {
        displayFiles(tmp + f.getName(), f);
      }
    }
  }

}










