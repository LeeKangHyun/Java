/*
 * 부모 스레드와 자식 스레드
 * - 어떤 스레드에서 다른 스레드를 생성하면 부모자식 관계가 된다.
 */
package step17.ex01;

public class Test05 {
  public static void main(String[] args) {
    Thread main = Thread.currentThread();
    Thread t1 = new Thread();
    
    System.out.println("최대 우선 순위:" + Thread.MAX_PRIORITY);
    System.out.println("최소 우선 순위:" + Thread.MIN_PRIORITY);
    System.out.println("기본 우선 순위:" + Thread.NORM_PRIORITY);
    System.out.println("main의 우선 순위:" + main.getPriority());
    System.out.println("t1의 우선 순위:" + t1.getPriority());

    // 스레드 우선 순위는 os에 따라 범위가 다르다.
    // 1) Windows : 1 ~ 7
    // 2) Solaris : 1 ~ 65535
    // 3) Java    : 1 ~ 10
    // 결론, 자바 프로그램을 어떤 os에서 실행하느냐에 따라 동작이 약간 다르다.
    // 주의!
    // => JVM에서 스레드를 구현할 때 OS에 의존(OS의 스레드를 사용한다.)하기 떄문에
    //    OS마다 다르게 동작한다.
    // => 자바의 이상인 "Write one, Run Anywhere!"에 어긋날 수 있다.
    // => 우선 순위에 의존하는 프로그래밍을 해서는 안된다.
    //    왜? OS마다 다르게 동작하기 때문에.
    // => 우선 순위를 이용하여 어떤 코드는 더 자주 실행하게 하고,
    //    어떤 코드는 덜 실행하게 하는 프로그래밍을 절대! 절대! 하지말라!!!
  }

}







