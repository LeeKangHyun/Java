import java.io.InputStream;
import java.util.Scanner;

public class Calc01 {

  class 
  public static void main(String[] args) {
    InputStream ks = System.in;
    Scanner sc = new Scanner(ks);
    
    int result;
    
    System.out.println("계산기 프로그램.");
    System.out.println("Input Number> ");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    
    System.out.println("1. + \n2. - \n3. * \n4. / \n5. Exit");
    System.out.println("Input Menu> ");
    int m = sc.nextInt();
    
    if (m == 1)
      result = n1 + n2;
    else if (m == 2)
      result = n1 - n2;
    else if
    
    System.out.println(n1 +" "+ n2);
    
  }

}
