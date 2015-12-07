package step06;

import org.springframework.beans.factory.FactoryBean;

// 스프링에서 제안한 규칙에 따라 팩토리 메서드 구현하기.
public class ComputerFactoryBean implements FactoryBean<Computer> {
  String type;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    System.out.println("setType()");
    this.type = type;
  }

  @Override
  public Computer getObject() throws Exception {
    System.out.println("getObject()");

    Computer computer = new Computer();

    switch (type) {
    case "game":
      computer.model = "울트라 게이밍 No.1";
      computer.maker = "용산컴";
      computer.ram = 16;
      computer.speed = 4.2f;
      break;

    case "develop":
      computer.model = "웹개발 슈퍼컴";
      computer.maker = "비트컴";
      computer.ram = 32;
      computer.speed = 3.0f;
      break;

    default:
      computer.model = "사무용 날쌘돌이";
      computer.maker = "아무나컴";
      computer.ram = 2;
      computer.speed = 2.0f;
    }

    return computer;
  }

  @Override
  public Class<?> getObjectType() {
    return Computer.class;
  }

  @Override
  public boolean isSingleton() {
    return false;
  }

}
