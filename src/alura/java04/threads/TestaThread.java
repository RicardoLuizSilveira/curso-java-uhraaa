package alura.java04.threads;

public class TestaThread {

	public static void main(String[] args) {
		
		Programa p1 = new Programa();
		p1.setId(1);
		
		Programa p2 = new Programa();
		p2.setId(1002);
		
		Thread tp1 = new Thread(p1);
		
		Thread tp2 = new Thread(p2);
		
		tp1.start();
		tp2.start();
		
	}

}
