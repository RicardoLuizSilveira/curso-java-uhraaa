package objetos;

class Carro {
  private int ano;
  private String modelo;
  private int velocidadeMaxima = 100;

  String[] s = new String[10];

  Carro(){}

  Carro(int ano, String modelo){
    this.ano = ano;
    this.modelo = modelo;
  }

  public int getAno() {
    return ano;
  }

  public String getModelo() {
    return modelo;
  }

  public void setVelocidadeMaxima(int velocidadeMaxima){
    this.velocidadeMaxima = velocidadeMaxima;
  }

  public int getVelocidadeMaxima() {
    return velocidadeMaxima;
  }

  public String getDadosDeImpressao(){
    return "Modelo: " + getModelo() + " :: Ano: " + getAno();
  }

}