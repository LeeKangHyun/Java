package step14.ex02;

import java.io.File;
import java.io.FileFilter;

public class Test07 {
  // 인스턴스를 단 한 번만 만든다면 익명 이너 클래스로 선언하라.
  static FileFilter fileFilter = new FileFilter() { 
    @Override
    public boolean accept(File file) {
      if (file.isDirectory() || file.getName().endsWith(".class"))
        return true;
      return false;
    }
  };

  public static void main(String[] args) throws Exception {
    // File 도구 사용법
    File file = new File("./bin");

    // 문제: 필터를 사용하여 목록으로 리턴할 파일을 선택한다. 
    // => 필터 조건: .class가 아닌 파일은 목록에서 제외한다.
    // => .class 확장자 제거
    // => 패키지명 포함
    // 예) step14.ex02.Test04 
    displayFiles(file);
  }

  private static void displayFiles(File file) {
    File[] files = file.listFiles(fileFilter);
    for (File f : files) {
      if (f.isFile()) {
        System.out.println(
           f.getPath()
            .replace(".class", "")
            .substring(6)
            .replace(System.getProperty("file.separator"), "."));
      } else if (f.isDirectory()) {
        displayFiles(f);
      }
    }
  }

}










