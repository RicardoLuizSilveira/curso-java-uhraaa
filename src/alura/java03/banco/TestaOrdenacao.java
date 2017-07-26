package alura.java03.banco;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import alura.java03.banco.conta.ContaPoupanca;

public class TestaOrdenacao {

	public static void main(String[] args) {
		
		List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();
		
		Random random = new Random();

		for (int i = 1; i < 10; i++) {

			ContaPoupanca cp = new ContaPoupanca("Cliente #" + i, i);

			cp.depositar(random.nextInt(500) + random.nextDouble());

			contas.add(cp);

		}

		Collections.reverse(contas);
		
//		System.out.println(contas.toString());

		for (ContaPoupanca conta : contas) {
			System.out.println(conta.getNome() + " : " + conta.pegarSaldo());
//			System.out.println(conta.getReference());
		}

	}

}
