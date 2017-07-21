package alura.java03.banco;

import alura.java03.banco.conta.ContaCorrente;
import alura.java03.banco.conta.ContaPoupanca;
import alura.java03.banco.conta.exceptions.ValorInvalidoException;
import alura.java03.banco.sistema.AtualizadorDeContas;

public class TestaConta {

	public static void main(String[] args) throws ValorInvalidoException {

		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.depositar(1000);
		cp.depositar(1000);

		System.out.println("Conta corrente: " + cc.pegarSaldo());
		System.out.println("Conta poupança: " + cp.pegarSaldo());

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		adc.roda(cc);
		adc.roda(cp);

		System.out.println("Saldo Total: " + adc.getSaldoTotal());
		
		System.out.println(cc.toString());
		

	}

}
