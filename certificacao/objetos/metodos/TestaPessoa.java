package objetos.metodos;

class TestaPessoa {

  public static void main(String args[]){

    Pessoa p = new Pessoa();
    p.setNome("Nome....");

    String nome = p.getNome();

    System.out.println(nome);


    System.out.println("Works!");
  }
}