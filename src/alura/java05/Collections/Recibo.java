package alura.java05.Collections;

public class Recibo {
	
	private Integer numero;
	
	public Recibo(Integer numero) {
		this.numero = numero;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	@Override
	public String toString() {
			return "[numero: " + numero + "]";
	}
	
}
