package alura.java03.banco.conta;

import alura.java03.banco.Tributavel;

/**
 * Implementação de uma Conta corrente
 * @author user
 *
 */
public class ContaCorrente extends Conta implements Tributavel{

	/**
	 * @param taxa de rendimento
	 * 
	 */
	@Override
	public void atualiza(double taxa) {
		this.saldo = this.saldo + taxa * 2;
	}

	@Override
	public double calculaTributos() {
		return this.pegarSaldo() * 0.01;
	}

}
