package alura.java01.basico;

public class Lacos {

	public static void main(String[] args) {

		int numero = 13;

		int i = numero;
		while (i != 1) {
			if (i % 2 == 0) {
				i = (i / 2);
			} else {
				i = 3 * i + 1;
			}

			System.out.print(i + ">");

		}

	}
}
