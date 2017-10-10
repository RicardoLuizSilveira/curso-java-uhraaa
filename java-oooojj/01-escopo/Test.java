public class Test {

  static int num = 10;

  public void method() {
    
    String txt = "works";

    System.out.println(txt);
    System.out.println(num);

    /*for(;;){
    } */

  }

  public static void main(String[] args) {
    Test t = new Test();
    t.method();
  }

}