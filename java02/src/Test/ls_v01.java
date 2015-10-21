package Test;

import java.io.File;
import java.util.Scanner;

public class ls_v01 {
  public static void main(String[] args) {

    File file = new File(".");
    Scanner sc = new Scanner(System.in);

    System.out.print("$> ");
    String command = sc.nextLine();
    if (command.equals("ls")) { 
        displayList(file);
    }
    sc.close();
  }

  private static void displayList(File file) {
    File[] Flist = file.listFiles();
    for (File f : Flist)
      System.out.println(f.getName());
  }
}