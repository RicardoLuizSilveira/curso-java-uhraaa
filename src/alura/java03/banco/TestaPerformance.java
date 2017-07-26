package alura.java03.banco;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		
		performanceTestArrayList(new ArrayList<Integer>());
		performanceTestArrayList(new HashSet<Integer>());
		
	}

	private static void performanceTestArrayList(Collection<Integer> collection) {
		System.out.println("Iniciando...");
		
		Collection<Integer> teste = collection;
		
		long inicio = System.currentTimeMillis();
		
		int total = 30000;
		
		System.out.println(".....inserindo");
		
		long tempoInicio = System.currentTimeMillis();
		
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		
		long tempoFim = System.currentTimeMillis();
		long tempoTotal = tempoFim - tempoInicio;
		
		System.out.println("......Final da inserção: " + tempoTotal);
		
		System.out.println("....buscando");
		
		tempoInicio = System.currentTimeMillis();
		
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		
		tempoFim = System.currentTimeMillis();
		tempoTotal = tempoFim - tempoInicio;
		
		System.out.println(".....Final da busca: " + tempoTotal);
		
		long fim = System.currentTimeMillis();
		
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
		System.out.println();
	}

}
