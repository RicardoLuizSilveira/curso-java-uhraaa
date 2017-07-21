package alura.java03.banco;

import alura.java03.banco.conta.ContaCorrente;
import alura.java03.banco.conta.exceptions.ValorInvalidoException;
import alura.java03.banco.sistema.GerenciadorDeImpostoDeRenda;

public class TestaTributavel {
	
	public static void main(String[] args) throws ValorInvalidoException {
		
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(1000);
		gerenciador.adiciona(cc);
		
		System.out.println(gerenciador.getTotal());
		
		System.out.printf("O saldo é: %.2f", cc.pegarSaldo());
		
	}
	
}
