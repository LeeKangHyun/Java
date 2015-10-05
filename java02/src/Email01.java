import java.util.Scanner;
import java.util.regex.Pattern;

public class Email01 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Email Input> ");
    String str = sc.nextLine();
    sc.close();

    String RegEx = "^[a-zA-Z0-9._-]+" // 모든단어 1글자이상으로 시작
        + "@+([a-zA-Z0-9])+" // @뒤에 1글자 이상
        + "(.[a-zA-z]+)"  // .뒤에 1글자 이상
        + "(.[a-zA-z])*";  // a@a.a 뒤에 서버용 이메일 .이 있어도 되고 없어도 되고
    //             "^\w         +@\w         +(.\w         +)       
    //             "^[a-zA-z0-9._-]+@[a-zA-z]+\\.[a-zA-Z]+";
    //             \\w (0-9a-zA-Z) 
    boolean tf = Pattern.matches(RegEx, str);
    
    if (tf)
      System.out.println(str + " is Email.");
    else
      System.out.println(str + " is not Email");
  }
}