public class Test {

  public void method() {
    
    String txt = "works";

    for(;;){
      System.out.println(txt);
    }

  }


  public static void main(String[] args) {
    Test t = new Test();
    t.method();
  }

}