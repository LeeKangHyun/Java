/*
 * 작업 목표 :
 * - 사용자에게 명령 프롬포트를 출력한다.
 * - 사용자에게서 명령어를 입력 받아 출력한다.
 * - 예)
 *   명령> help
 *   help
 */
package step09.v01;

import java.util.Scanner;

public class ProjectApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("명령> ");
    String command = sc.nextLine();

    System.out.println(command);
    sc.close();

  }

}









