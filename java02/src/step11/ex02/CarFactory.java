package step11.ex02;

public class CarFactory {
  public static final int SEDAN_NORMAL = 1;
  public static final int SEDAN_CAMPING = 2;
  public static final int TRUCK_SIMPLE= 3;
  public static final int TRUCK_DUMP= 4;
  public Car createCar(int type) {
    Car car = null;
    switch (type) {
    case SEDAN_NORMAL:
      car = new SUV(false, false);
      car.setCapacity(5);
      car.setCc(800);
      car.setMaker("현다이자동차");
      car.setModel("후라이드");
      break;
      
    case SEDAN_CAMPING:
      car = new SUV(true, true);
      car.setCapacity(5);
      car.setCc(2500);
      car.setMaker("현다이자동차");
      car.setModel("카렌");
      break;
      
    case TRUCK_SIMPLE:
      car = new Truck(4500, false);
      car.setCapacity(3);
      car.setCc(4000);
      car.setMaker("현다이자동차");
      car.setModel("봉봉");
      break;
      
    case TRUCK_DUMP:
      car = new Truck(10000, true);
      car.setCapacity(3);
      car.setCc(9000);
      car.setMaker("현다이자동차");
      car.setModel("타이탄");
      break;
    }
    return car;
  }
}
