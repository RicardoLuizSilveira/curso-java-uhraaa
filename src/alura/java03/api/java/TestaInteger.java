package alura.java03.api.java;

public class TestaInteger {

	public static void main(String[] args) {

		Integer x1 = new Integer(10);

		Integer x2 = new Integer(10);

		if (x1 == x2) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}

		if (x1.equals(x2)) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}

		// Auto-boxing works unless new is used
		// Integer x = Integer.parseInt("1");
		//
		// Integer x3 = Integer.parseInt("1");
		//

		Integer x = 1;

		Integer x3 = 1;

		if (x == x3) {
			System.out.println("Igual");
		} else {
			System.out.println("Diferente");
		}

	}

}
