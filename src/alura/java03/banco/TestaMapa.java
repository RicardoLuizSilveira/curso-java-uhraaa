package alura.java03.banco;

import java.util.HashMap;
import java.util.Map;

import alura.java03.banco.conta.Conta;
import alura.java03.banco.conta.ContaCorrente;
import alura.java03.banco.conta.exceptions.ValorInvalidoException;

public class TestaMapa {

	public static void main(String[] args) throws ValorInvalidoException {
		
		Conta c1 = new ContaCorrente("J", 560);
		c1.depositar(560.5);
		
		Conta c2 = new ContaCorrente("abc", 56);
		c2.depositar(45.65);
		
		Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();
		
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		
		Conta contaDoDiretor = mapaDeContas.get("diretor");
		
		System.out.println(contaDoDiretor.pegarSaldo());
		
	}

}
