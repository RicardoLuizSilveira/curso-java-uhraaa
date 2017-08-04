package alura.java05.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TesteMap {

	public static void main(String[] args) {
		
		Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        
        System.out.println("Iterando sobre as chaves");
        
        nomesParaIdade.keySet().forEach(key -> {
        	System.out.println(key);
        });
        
        System.out.println("\nIterando sobre os valores");
        
        nomesParaIdade.values().forEach(value -> {
        	System.out.println(value);
        });
        
        System.out.println("\nIterando sobre sobre a associação");
        Set<Entry<String, Integer>> entradas = nomesParaIdade.entrySet();
        entradas.forEach(e -> {
        	System.out.println("key: " + e.getKey() + ", value: " + e.getValue());
        });
        
	}

}
