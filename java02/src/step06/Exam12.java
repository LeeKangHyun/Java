/*
 * 주제: 자바 핵심 클래스 - 랩퍼 클래스(1)
 * - Wrapper class?
 *   => primitive 타입의 값을 다루는 클래스 
 *      byte  ---> Byte
 *      short ---> Short
 *      int   ---> Integer
 *      long  ---> Long
 *      double---> Double
 *      char  ---> Character
 *      boolean--> Boolean
 */
package step06;

import java.lang.reflect.Method;

public class Exam12 {

  public static void main(String[] args) throws Exception{
    // 랩퍼 클래스는, 
    // 이렇게 원시 타입의 값을 다루는 다양한 메소드를 보유하고 있다.
    // => 원시타입의 값을 다양한 방법으로 다루고 싶을 때 사용한다.
    // => 반드시 인스턴스로 값을 주고 받아야 할 때 사용한다.
    //    원시 타입은 인스턴스가 아니기 때문에 레퍼런스 변수로 주고 받을 수 없다.
    int i = 10;
    Integer obj1 = new Integer(10);
    int i2 = obj1.intValue();
    
    boolean b = true;
    Boolean obj2 = new Boolean(true);
    Boolean obj3 = new Boolean("true");
    Boolean b2 = Boolean.getBoolean("false");
    
  }
}




