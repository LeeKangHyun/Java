/*
 * 작업 목표 :
 * - 반복해서 사용자로부터 명령어를 입력 받는다.
 * - quit라는 명령어를 입력할 때까지 반복한다.
 */
package step09.v02;

import java.util.Scanner;

public class ProjectApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String command = null;
    do {
      System.out.print("명령> ");
      command = sc.nextLine();
      System.out.println(command);
    } while(!command.equals("quit"));
    System.out.println("안녕히 가세요.");
    //sc.close();

  }

}









