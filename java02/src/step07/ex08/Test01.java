/*
 * 주제: 다형성 - 다형적 변수의 활용
 * - 상위 클래스의 레퍼런스를 이용하여 하위 클래스를 가리키기.
 * - 여러 클래스의 인스턴스를 가리키는 방법
 */
package step07.ex08;

public class Test01 {
  static class Student {  // 사용자 정의 데이터 타입
    String name;
    String tel;

    public Student(String name, String tel) {
      this.name = name;
      this.tel = tel;
    }
  }


  static class Product {
    String title;
    int price;

    public Product(String title, int price) {
      this.title = title;
      this.price = price;
    }
  }

  public static void main(String[] args) {
    // 1) 숫자, 실수, 논리, 문자열, 학생정보, 제품 정보를 담을 수 있는 배열을 만들자!
    int i = 10;
    float f = 3.14f;
    boolean b = true;
    String str = "Hello"; // new String("Hello") 중복 생성하지 않는다.
    Student s = new Student("홍길동", "111-1111");
    Product p = new Product("아이폰", 980000);

    // int, float, boolean과 원시타입의 데이터인 경우,
    // 원시타입과 대응하는 랩퍼 클래스의 인스턴스를 생성하여 print()로 넘긴다.  => autoboxing
    // String, Student, Product처럼 기타 클래스의 인스턴스들은
    // 그대로 print()로 넘긴다.
    //
    // 자바의 모든 클래스는 Object의 하위 클래스 이기 때문에
    // Object 레퍼런스 변수에 넘길 수 있다.
    print(str);
  }

  static void print(Object obj) {
    /*
     * Object 레퍼런스 변수는 그 하위 클래스의 인스턴스를 가리킬 수 있다.
     * - 하위 클래스의 인스턴스 주소를 담을 수 있다.
     * - 변수가 여러 타입의 값을 담을 수 있다고 해서 
     *   "다형적 변수(polymorphic variable)라고 한다.
     */
    System.out.println(obj);
  }

}









