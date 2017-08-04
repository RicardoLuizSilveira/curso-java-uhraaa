package alura.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		

		Collections.sort(palavras);

		System.out.println(palavras);
		
		System.out.println("\n### Comparator");

		//Comparator<String> comparador = new ComparadorDeStringPorTamanho();
		palavras.sort((String o1, String o2) -> o1.length()-o2.length());

		System.out.println(palavras);
		
		
		System.out.println("\n### Consumer #########################");
		palavras.sort(Comparator.comparing(String::valueOf));
		
		System.out.println(palavras);
		
		
		
		System.out.println("\n### Consumer");

		// Consumer<String> consumer = new ConsumidorDeString();
		palavras.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});

		System.out.println("\n### Lambda#########################");

		palavras.forEach(System.out::println);
		
		
		//new Thread(() -> System.out.println("Executando um Runnable")).start();

		
		
		System.out.println("\n### Sort Method Reference");
		
		
		Function<String, Integer> function = new Function<String, Integer>() {
			
			@Override
			public Integer apply(String t) {
				return t.length();
			}
		};
		
		Comparator<String> comparador = Comparator.comparing(function);
		
		
		
		palavras.sort(comparador);
		
		System.out.println(palavras);
		
		
		
		
		
		
		
	}

}




