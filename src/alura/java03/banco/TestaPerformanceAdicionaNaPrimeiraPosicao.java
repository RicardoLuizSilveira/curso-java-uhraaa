package alura.java03.banco;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceAdicionaNaPrimeiraPosicao {

	public static void main(String[] args) {
		
		List<Integer> teste = new LinkedList<Integer>();
				
		List<Integer> teste2 = new ArrayList<Integer>();
		
		adicionaNaPrimeiraPosicaoDaLista(teste2);
		
		adicionaNaPrimeiraPosicaoDaLista(teste);
		
		
		List<Integer> teste3 = new LinkedList<Integer>();
		
		int total = 30000;
		
		for (int i = 0; i < total; i++) {
			teste3.add(i);
		}
		
		loadList(teste3);
	}

	private static void loadList(List<Integer> list) {

		System.out.println("Iniciando percorre lista ...");
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
		}
		
		long fim = System.currentTimeMillis();
		
		long tempoTotal = fim - inicio;
		
		System.out.println("Tempo gasto percorre lista: " + tempoTotal);
	}

	private static void adicionaNaPrimeiraPosicaoDaLista(List<Integer> lista) {
		int total = 30000;
		
		List<Integer> teste = lista;
		
		System.out.println("Iniciando...");
		
		long inicio = System.currentTimeMillis();
		
		
		for (int i = 0; i < total; i++) {
			teste.add(0, i);
		}
		
		long fim = System.currentTimeMillis();
		
		long tempoTotal = fim - inicio;
		
		System.out.println("Tempo gasto: " + tempoTotal);
	}

}
