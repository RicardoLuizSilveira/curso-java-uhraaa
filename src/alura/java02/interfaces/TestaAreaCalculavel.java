package alura.java02.interfaces;

public class TestaAreaCalculavel {

	public static void main(String[] args) {
		
		AreaCalculavel a = new Retangulo(2, 3);
		System.out.println(a.calculaArea());
		
	}

}
