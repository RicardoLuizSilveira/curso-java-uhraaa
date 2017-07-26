package alura.java03.banco.conta;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca () {
		
	}

	public ContaPoupanca(String nome, int numero) {
		super(nome, numero);
	}

	private double taxaDeServico = 0.1;

	@Override
	public void depositar(double valor) {
		valor -= taxaDeServico;
		this.saldo += valor;
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo + taxa * 3;
	}

	@Override
	public int compareTo(Conta outra) {

		ContaPoupanca outraConta = (ContaPoupanca) outra;
		
		return this.getNome().compareTo(outraConta.getNome());
	}

}
