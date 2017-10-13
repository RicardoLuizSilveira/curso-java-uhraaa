package br.com.caelum.certificacao;

class Pessoa{

  int age = 88;
}

public class RunApp {
  
  public static void main(String       []args) {
    System.out.println("Package working!");

    for (String arg : args) {
      System.out.println(arg);
    }

    /* Pessoa p = new Pessoa();

    System.out.println(p.age); */
  }

}