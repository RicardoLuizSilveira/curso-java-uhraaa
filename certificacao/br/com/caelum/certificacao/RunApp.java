package br.com.caelum.certificacao;

class Pessoa{

  int age = 88;
}

public class RunApp {
  
  public static void main(String[]args) {
    System.out.println("Package working!");

    for (String arg : args) {
      System.out.println(arg);
    }

    int i = 0;
    for (boolean a = true; a; i++) {
      System.out.println(i);
      if(i > 5)a = false;
    }

    // System.out.println(3E2);

    /* Pessoa p = new Pessoa();

    System.out.println(p.age); */
  }

}