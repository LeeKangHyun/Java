/*
 * 작업 목표 :
 * - 사용자가 입력한 명령어가 help이면, "도움말입니다"를 출력한다.
 *   사용자가 입력한 명령어가 list이면, "목록입니다"를 출력한다.
 *   사용자가 입력한 명령어가 add이면, "추가입니다"를 출력한다.
 *   그 밖의 명령어이면, "해당 명령어를 지원하지 않습니다!"를 출력한다.
 */
package step09.v04;

import java.util.Scanner;

public class ProjectApp {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String command = null;
    do {
      System.out.print("명령> ");
      command = sc.nextLine();
      switch (command) {
      case "help":
        System.out.println("도움말 입니다.");
        break;
      case "list":
        System.out.println("목록 입니다.");
        break;
      case "add":
        System.out.println("추가 입니다.");
        break;
      case "delete":
        System.out.println("삭제 입니다.");
        break;
      case "quit":
        break;
      default:
        System.out.println("해당 명령어를 지원하지 않습니다!");
      }
    } while(!command.equals("quit"));
    System.out.println("안녕히 가세요.");
    sc.close();

  }

}









