import java.util.Stack;

public class test01 {

  static boolean check(String content) {
    Stack<Character> stack = new Stack<Character>();

    char c;
    for (int i = 0; i < content.length(); i++) {
      c = content.charAt(i);
      if (c == '(' || c == '{' || c =='[') {
        stack.push(c);
      } 
      else if (c == ')' && stack.isEmpty() && stack.peek() != '(') {
        return false;
      } 
      else if (c == '}' && stack.isEmpty() && stack.peek() != '{') {
        return false;
      } 
      else if (c == ']' && stack.isEmpty() && stack.peek() != '[') {
        return false;
      }
      if (c == ')' || c == '}' || c == ']') {
        if (stack.size() == 0) {
          return false;
        }
        stack.pop();
      }
    }
    if (stack.size() > 0)
      return false;

    return true;
  }
  //System.out.println(content.charAt(i));

  System.out.println("----------------");
  //for (int i = 0; i < stack.size(); i++) {
  while (!stack.isEmpty()) {
    System.out.println(stack.pop());
    return false;
  }

  public static void main(String[] args) {
    String str = "test ( okok ()dd()ok {dkdkdkd [] dkddkk) sdkdfd )";

    System.out.printf("%d: %d\n", (int)'(', (int)')');
    System.out.printf("%d: %d\n", (int)'{', (int)'}');
    System.out.printf("%d: %d\n", (int)'[', (int)']');
  }

