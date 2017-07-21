package alura.java03.banco.sistema;

import alura.java03.banco.Tributavel;

public class GerenciadorDeImpostoDeRenda {
	
	private double total;

	public void adiciona(Tributavel t) {
		System.out.println("Adicionando tributável " + t);
		this.total += t.calculaTributos();
	}
	
	public double getTotal() {
		return total;
	}
	
}
