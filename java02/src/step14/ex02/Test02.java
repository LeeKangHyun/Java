package step14.ex02;

import java.io.File;

public class Test02 {
  public static void main(String[] args) throws Exception{
    // File 도구 사용법
    File file = new File(".");

    // 문제: 모든 하위 파일(디렉토리 포함)의 이름을 출력하라.
    //      단, 하위 파일에 대해 2칸 들여쓰기를 적용하여 계층 구조로 출력하라!
    //      힌트) 재귀호출 사용하면 편하다.

    displayFiles(0, file);

    /*File[] files = file.listFiles();
    int tab = 1;
    for (File i : files) {
      System.out.printf("%s", i.getName());
      if (file.isDirectory()) {
        DirPrint(file.getName(), tab);
      }
    }*/
  }

  private static void displayFiles(int level, File file) {
    File[] files = file.listFiles();

    for (File f : files) {
      for (int i = 0; i < level; i++) System.out.print("  ");
      System.out.println(f.getName());
      if (f.isDirectory()) {
        displayFiles(level + 1, f);
      }
    }
  }
  /*public static void DirPrint(String sub, int tab) throws Exception {
    File file = new File(sub);

    String stab = " ";

    for (int i = 0; i < tab; i++) {
      stab += stab;
    }

    File[] sublist = file.listFiles();
    for (File list : sublist) {
      System.out.println(stab + list.getName());
      if (list.isDirectory()) {
        DirPrint(list.getCanonicalPath().toString(), tab+1);
      }
    }
  }*/
}









