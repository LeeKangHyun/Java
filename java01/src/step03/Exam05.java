/*
 * 주제 : 반복문 - for
 */
package step03;

import java.io.File;

public class Exam05 {

  public static void main(String[] args) {
    File f1 = new File("c:/");

    String[] files = f1.list();
    for (int i = 0; i < files.length; i = i + 1)
      System.out.println(files[i]);
  }
}