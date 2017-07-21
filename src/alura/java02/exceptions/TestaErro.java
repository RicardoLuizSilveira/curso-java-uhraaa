package alura.java02.exceptions;

public class TestaErro {

	public static void main(String[] args) {
		System.out.println("Inicio main >>>>>>>>>>>");
		try {
			metodo1();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("erro: " + e);
		}
		System.out.println("Fim main >>>>>>>>>>>");

	}

	private static void metodo1() {
		System.out.println("Inicio metodo1 ********");
		metodo2();
		System.out.println("Fim metodo1 ********");
	}

	private static void metodo2() {
		System.out.println("Inicio metodo2 ----------");

		int[] array = new int[3];

		for (int i = 0; i < 5; i++) {
			array[i] = i;
			System.out.println(i);
		}

		System.out.println("Fim metodo2 ----------");
	}

}
