package alura.java03.banco.conta;

public class ContaPoupanca extends Conta {

	private double taxaDeServico = 0.1;
	
	public ContaPoupanca(String nome, int numero) {
		this.setNome(nome);
		this.setNumero(numero);
	}

	public ContaPoupanca() {
		super();
	}

	@Override
	public void depositar(double valor) {
		valor -= taxaDeServico;
		this.saldo += valor;
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo + taxa * 3;
	}

}
