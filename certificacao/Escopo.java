class Escopo {

  static boolean continuar = true;

  public void testandoForComVariosArgumentos(){
    for(int i = 0, j = 10; i < 10 && true; i++, j++) {
      System.out.print("Valor de i = " + i);
      System.out.println(" - Valor de j = " + j);
    }
  }

  public void testandoForComArgumentosMistos(){

    // boolean continuar = true;
    System.out.println("Iniciando...");
    for(int i = 0, j = 10; i < 10 && continuar; i++, j++) {
      System.out.print("Valor de i = " + i);
      System.out.println(" - Valor de j = " + j);
      if(j > 14) continuar = false;
    }
  }

  public void testandoForComBoolean(){

    int i = 0;

    for(boolean j = true; j;) {
      i++;
      System.out.println("Valor de i = " + i);
      if(i > 5) j = false;
    }
  }

  public static void main(String[] args) {
    System.out.println("Works!");
    
    // new Escopo().testandoForComVariosArgumentos();
    // new Escopo().testandoForComBoolean();
    new Escopo().testandoForComArgumentosMistos();
    new Escopo().testandoForComArgumentosMistos();
  }
}