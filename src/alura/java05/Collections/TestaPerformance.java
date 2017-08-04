package alura.java05.Collections;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		
		Collection<Integer> numeros = new HashSet<Integer>();
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < 50000; i++) {
			numeros.add(i);
		}
		
		numeros.forEach(numero -> {
			numeros.contains(numero);
		});
		
//		for (Integer numero : numeros) {
//			numeros.contains(numero);
//		}
		
		long fim = System.currentTimeMillis();
		long tempoDeExecucao = fim - inicio;
		System.out.println(tempoDeExecucao);
		
	}

}
