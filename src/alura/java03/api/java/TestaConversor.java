package alura.java03.api.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class TestaConversor {

	public static void main(String[] args) throws FileNotFoundException {
		
		int valor = converteStringEmInt("765");
		
		System.out.println(valor);
		
		InputStream is = new FileInputStream("file");
		
	}

	private static int converteStringEmInt(String string) {
		
		
		int multiplicador = 1;
		
		int fator = 10;
		
		int resultado = 0;
		
		for(int i = string.length() - 1; i >= 0; i--) {
			
			char c = string.charAt(i);
			
			int num = c - '0';
			
			resultado += num * multiplicador;
			
			multiplicador *= fator;
			
			
		}
		
		
		return resultado;
	}

}
