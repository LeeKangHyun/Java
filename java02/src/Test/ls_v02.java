package Test;

import java.io.File;
import java.util.Scanner;

public class ls_v02 {
  
  public static void main(String[] args) {
    File file = new File(".");
    
    Scanner sc = new Scanner(System.in);

    System.out.print("root $ ");
    String[] command = sc.nextLine().split(" ");
    if (command[0].equals("ls")) {
      if (command.length == 0)
        displayList(file);
      else (command[1].equals("-a")) {
          displayList2(file);
        }
    }
    sc.close();
  }

  private static void displayList(File file) {
    File[] fList = file.listFiles();
    for (File f : fList)
      System.out.println(f.getName());
  }
  
  private static void displayList2(File file) {
    File[] fList = file.listFiles();
    for (File f : fList)
      System.out.println(" ");
  }
}