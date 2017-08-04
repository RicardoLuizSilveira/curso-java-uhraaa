package alura.java8;

import java.util.function.Consumer;

public class ConsumidorDeString implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println("consumindo String");
		System.out.println(t);
		
	}

}
