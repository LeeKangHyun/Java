/*
 * 주제: 오버라이딩 할 때 접근 범위의 조정은?
 */
package step06;

public class Exam19 {
  
  class ClassA {
    private void m1() {}
    void m2() {}
    protected void m3() {}
    public void m4() {}
  }
  
  // 오버라이딩 할 때 접근 범위를 확대하기!
  class ClassB extends ClassA {
    @Override
    public void m2() {} // default ==> public 
    
    @Override
    public void m3() {} // protected ==> public
  }

  // 오버라이딩 할 때 접근 범위를 축소하기!
  // => 접근 범위를 줄일 수 없다. 문법 오류!
  class ClassC extends ClassA {
    //@Override
    //private void m2() {} // default ==> private 오류!
    
    //@Override
    //public void m3() {} // protected ==> default 오류!
  }
  public static void main(String[] args) throws Exception{
    
    
  }
}









