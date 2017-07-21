package alura.java02;

import alura.java02.exceptions.ValorInvalidoException;

public abstract class Conta {

	protected double saldo = 0.0;

	public double pegarSaldo() {
		return saldo;
	}

	public void depositar(double valor) throws ValorInvalidoException {
		if(valor < 0) {
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
	
	public abstract void atualiza (double taxa);
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
