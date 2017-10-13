package objetos;

class TestaCicloDeVida {

  

  public static void main(String args[]) {
    Carro c = new Carro(2014, "Pálio");

    System.out.println(c.getAno());

    String[] s = new String[3];
    
    for(String str : s){
      System.out.println(str);
    }

  }

}