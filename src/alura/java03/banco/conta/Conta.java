package alura.java03.banco.conta;

import alura.java03.banco.conta.exceptions.ValorInvalidoException;

public abstract class Conta implements Comparable<Conta>{

	private String nome;
	private int numero;
	protected double saldo = 0.0;
	
	public Conta (){
		
	}
	
	public Conta(String nome, int numero) {
		this.setNome(nome);
		this.setNumero(numero);
	}

	public double pegarSaldo() {
		return saldo;
	}

	public void depositar(double valor) throws ValorInvalidoException {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
	}

	public void sacar(double valor) {

		if (saldo >= valor) {
			saldo -= valor;
		}

	}

	public abstract void atualiza(double taxa);

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public int compareTo(Conta outra) {

		return this.getNumero() - outra.getNumero();
	}

	@Override
	public String toString() {
		return "O saldo da conta é: " + saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	

}
