package alura.java02;

import alura.java02.exceptions.ValorInvalidoException;

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
