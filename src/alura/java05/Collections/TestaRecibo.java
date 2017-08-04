package alura.java05.Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestaRecibo {

	public static void main(String[] args) {
		
		Recibo r1 = new Recibo(45);
		Recibo r2 = new Recibo(2);
		Recibo r3 = new Recibo(895);
		
		Set<Recibo> recibos = new TreeSet<>(Comparator.comparing(Recibo::getNumero));
		
		recibos.add(r1);
		recibos.add(r2);
		recibos.add(r3);
		
		System.out.println(recibos);
	}

}
