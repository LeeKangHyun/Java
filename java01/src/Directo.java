import java.io.File;

public class Directo {

  public static void main(String[] args) {
    File f1 = new File("C:/javaide/Prac");

    System.out.println("상위 폴더: " + f1.getAbsolutePath());
    System.out.println("파일명");

    String[] files = f1.list();

    for (int i = 0; i < files.length; i++)
      System.out.println(files[i]);
  }
}
