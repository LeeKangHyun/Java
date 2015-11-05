package step11.ex02;

public class Test02 {

  public static void main(String[] args) {
    // 객체 생성 과정이 복잡한 경우 직접 객체를 생성하기 보다는,
    // 객체 생성 전문가에게 맡기는 것이 유지보수에 좋다.
    CarFactory factory = new CarFactory();
    
    // 싼 승용차
    Car c1 = factory.createCar(CarFactory.SEDAN_NORMAL);
    
    // 여행을 좋아하는 4인 가족용 자동차.           
    Car c2 = factory.createCar(CarFactory.SEDAN_CAMPING);
    
    // 이사할 때 사용할 짐차
    Car c3 = factory.createCar(CarFactory.TRUCK_SIMPLE);
    
    // 4대강 모래를 실어나를 차
    Car c4 = factory.createCar(CarFactory.TRUCK_DUMP);
    
    /* 팩토리 메서드 패턴?
     * - 객체를 생성을 해주는 메서드
     * - 복잡한 객체 생성 과정을 감춘다. => 위와같이 코드가 간결해진다.
     */
  }

}
