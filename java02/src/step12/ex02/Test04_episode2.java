package step12.ex02;

public class Test04_episode2 {

  public static void printScore(String name, int... valueList) {
    System.out.println("plus(int...)");
    int sum = 0;
    for (int i : valueList) {
      sum += i;
    }
    System.out.printf("%s: %d", name, sum);
  }

  // "varargs(아규먼트 목록)"은 항상 메서드 선언에서 맨 마지막에 와야 한다.
  // 다음은 오류!
  /*
  public static void printScore2(int... valueList, String name) { }
  public static void printScore2(String name, int... valueList, boolean a) { }
  */
  
  public static void main(String[] args) {
    printScore("홍길동");
    printScore("임꺽정", 100, 90);
    printScore("유관순", 100, 90, 80);
    //printScore("오호라", 100, 90, 80, true);
  }
}
