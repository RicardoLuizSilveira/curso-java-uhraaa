package alura.java03.banco;

import alura.java03.banco.conta.ContaCorrente;

public class TestaComparacaoDeConta {

	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente();
		ContaCorrente cc2 = new ContaCorrente();
		
		cc1.setNome("Hugo");
		cc1.setNumero(123);
		
		cc2.setNome("Hugo");
		cc2.setNumero(123);
		
		if (cc1 == cc2) {
			System.out.println("iguals ==");
		} else {
			System.out.println("diferentes ==");
		}
		
		if (cc1.equals(cc2)) {
			System.out.println("iguais 'equals'");
		} else {
			System.out.println("diferentes 'equals'");
		}
	}

}
