package alura.java03.banco;

import alura.java03.banco.conta.ContaCorrente;
import alura.java03.banco.conta.exceptions.ValorInvalidoException;

public class TestaDeposita {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		ContaCorrente cc = new ContaCorrente();
		try {			
			cc.depositar(-50);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Final do main");
		
		// erro de jvm sem memória
		//String[] ss = new String[Integer.MAX_VALUE];
	}

}
