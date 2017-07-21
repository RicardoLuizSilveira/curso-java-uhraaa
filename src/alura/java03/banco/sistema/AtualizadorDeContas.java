package alura.java03.banco.sistema;

import alura.java03.banco.conta.Conta;

public class AtualizadorDeContas {

	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}
	
	public void roda(Conta c) {
		System.out.println("==============================");
		System.out.println("Saldo anterior: " + c.pegarSaldo());
		
		c.atualiza(selic);
		double saldoAtualDaConta = c.pegarSaldo();
		saldoTotal += saldoAtualDaConta;
		
		System.out.println("Saldo atualizado: " + saldoAtualDaConta);
	}
	
	public double getSaldoTotal() {
		return this.saldoTotal;
	}

}
