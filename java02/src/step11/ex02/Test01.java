package step11.ex02;

public class Test01 {

  public static void main(String[] args) {
    // 싼 승용차
    Car c1 = new SUV(false, false);
    c1.setCapacity(5);
    c1.setCc(800);
    c1.setMaker("현다이자동차");
    c1.setModel("후라이드");
    
    // 여행을 좋아하는 4인 가족용 자동차.
    Car c2 = new SUV(true, true);
    c2.setCapacity(5);
    c2.setCc(2500);
    c2.setMaker("현다이자동차");
    c2.setModel("카렌");
    
    // 이사할 때 사용할 짐차
    Car c3 = new Truck(4500, false);
    c3.setCapacity(3);
    c3.setCc(4000);
    c3.setMaker("현다이자동차");
    c3.setModel("봉봉");
    
    // 4대강 모래를 실어나를 차
    Car c4 = new Truck(10000, true);
    c3.setCapacity(3);
    c3.setCc(9000);
    c3.setMaker("현다이자동차");
    c3.setModel("타이탄");
    
    /* 객체를 사용하려면 위와 같이 용도에 따라 적절히 초기화를 시켜야한다.
     * 매번 객체를 생성하는 과정이 번거롭고,
     * 만약 DBMS라든가 외부 서버에 연결하는 작업까지 들어간다면 객체 생성 과정이 더 복잡해진다.
     * => 해결책: 객체 생성을 전문가에게 맡긴다. => "Factory 메소드"
     */
  }

}
