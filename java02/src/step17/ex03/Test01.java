/*
 * 스레드 동기화 적용 전
 */
package step17.ex03;

public class Test01 {
  static class Account {
    String accId;
    long balance;
    
    // 크리티컬 섹션(Critical Section)
    // => 여러 스레드가 동시에 접근했을 때 문제가 발생할 수 있는 코드
    // => 해결책? 한 번에 한 스레드만이 접근하도록 제약을 가한다.
    //          "뮤텍스(Mutual Exclusion)"라 부른다.
    public long withdraw(long money) {
      long temp = this.balance - money;
      
      delay();
      
      if (temp < 0) 
        return 0;
      
      delay();
      
      this.balance = temp;
      
      delay();
      
      return money;
    }
    
    private void delay() {
      // 시간 지연 효과 얻기 => CPU를 많이 사용하기
      // 1) 8바이트 크기의 데이터를 다루는 것이 4바이트를 다루는 것 보다 느리다.
      //    자바는 기본이 4바이트이다.
      // 2) 정수 보다 부동소수점을 다루는 것이 더 시간이 오래 걸린다.
      double d1 = 3.14, d2 = 2.1234567;
      double d3 = d1 / d2;
      
      for (int i = 0; i < 1000; i++) {
        d3 /= 2.345;
      }
    }
  }
  
  static class Atm365 extends Thread {
    Account account;
    
    public Atm365(String name, Account account) {
      super(name);
      this.account = account;
    }
    
    @Override
    public void run() {
      long sum = 0;
      long money = 0;
      
      while (true) {
        money = account.withdraw(100);
        if (money == 0)
          break;
        sum += money;
      }
      
      System.out.printf("%s = %d\n", this.getName(), sum);
    }
  }
  
  
  public static void main(String[] args) {
    Account account = new Account();
    account.accId = "111-1111-11-1111";
    account.balance = 10000;
    
    Atm365 t1 = new Atm365("강남", account);
    Atm365 t2 = new Atm365("양재", account);
    Atm365 t3 = new Atm365("논현", account);
    Atm365 t4 = new Atm365("종로", account);
    
    t1.start();
    t2.start();
    t3.start();
    t4.start();
    
  }
}
