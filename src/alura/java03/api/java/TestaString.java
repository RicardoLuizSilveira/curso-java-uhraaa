package alura.java03.api.java;

import java.io.PrintStream;

public class TestaString {

	public static void main(String[] args) {
		
		String s = "  Fazendo teste de string 5 ";
		String s2 = ""; // IMPORTANTE: string vazia é diferente de nula
		
		System.out.println("Search substring (contains): " + s.contains("teste"));
		
		System.out.println("delete white spaces (trim): " + s.trim());
		
		System.out.println("String vazia: " + s.isEmpty());
		
		System.out.println("String vazia: " + s2.isEmpty());
		
		PrintStream saida;
		saida = System.out;
		saida.println("PrintStream");
		
//		imprimePalavraPorLinha("Matera");
//		
//		imprimePalavraAoContrario("Socorram-me, subi no ônibus em Marrocos");
//		System.out.println();
//		imprimePalavraAoContrario("anotaram a data da maratona");
		System.out.println();
		System.out.println(imprimePalavrasEmOrdemInvertida("Socorram-me, subi no ônibus em Marrocos"));
	}

	private static String imprimePalavrasEmOrdemInvertida(String frase) {
		
		StringBuilder sb = new StringBuilder(frase).reverse();
		
		
//		String[] palavras = frase.split(" ");
//		
//		
//		for (int i = palavras.length - 1; i >=0; i--) {
//			sb.append(palavras[i]);
//			sb.append(" ");
//		}
		return sb.toString();
		
		
	}

	private static void imprimePalavraPorLinha(String txt) {
		for(int i = 0; i < txt.length(); i++) {
			System.out.println(txt.charAt(i));
		}
	}
	
	private static String imprimePalavraAoContrario(String txt) {
		StringBuilder sb = new StringBuilder();
		for(int i = txt.length() - 1; i >= 0 ; i--) {
//			System.out.print(txt.charAt(i));
			sb.append(txt.charAt(i));
		}
		return sb.toString();
	}

}
