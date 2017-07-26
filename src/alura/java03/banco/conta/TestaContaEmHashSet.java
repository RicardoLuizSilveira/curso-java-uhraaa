package alura.java03.banco.conta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import alura.java03.banco.conta.exceptions.ValorInvalidoException;

public class TestaContaEmHashSet {

	public static void main(String[] args) throws ValorInvalidoException {
		
		Set<Conta> contas = new HashSet<Conta>();
		
		Conta c1 = new ContaCorrente("C1", 560);
		c1.depositar(560.5);
		
		Conta c2 = new ContaCorrente("C2", 56);
		c2.depositar(45.65);
		
		Conta c3 = new ContaCorrente("C3", 56);
		c2.depositar(100.0);
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		System.out.println(contas.toString());
//		
//		
//		Set<Integer> numeros = new TreeSet<Integer>();
//		
//		for (int i = 2; i < 1000; i++) {
//			numeros.add(i);
//		}
//		
//		
//		for (Integer i : ((NavigableSet<Integer>) numeros).descendingSet()) {
//			System.out.println(i);
//		}
//		
//		Iterator<Integer> iterator =  ((NavigableSet<Integer>) numeros).descendingIterator();;
//		
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		
		List<Integer> numList = new ArrayList<Integer>();
		
		for(int i = 2; i < 1000; i++) {
			numList.add(i);
		}
		
		Collections.reverse(numList);
		
		for(Integer i : numList) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
