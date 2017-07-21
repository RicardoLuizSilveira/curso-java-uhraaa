package alura.java02.interfaces;

public class Retangulo implements AreaCalculavel {

	private int altura;
	private int largura;

	Retangulo(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		return altura * largura;
	}

}
