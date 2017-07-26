package alura.java03.banco;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import alura.java03.banco.conta.Conta;

public class Banco {
	
	private List<Conta> contas;
	
	private Map<String, Conta> contaMap = new HashMap<String, Conta>();
	
	private int quantidadeDeContas = 0;
	
	public Banco () {
		this.contas = new LinkedList<Conta>();
	}
	
	public Banco (List<Conta> contas) {
		this.contas = contas;
	}

	public void adicionaConta (Conta conta) {
		contas.add(conta);
		contaMap.put(conta.getNome(), conta);
		quantidadeDeContas++;
	}
	
	public Conta pegaConta(int index) {
		return contas.get(index);
	}
	
	public int PegaQuantidadeDeContas () {
		return quantidadeDeContas;
	}
	
	public Conta buscaPorNome(String nome) {		
		return contaMap.get(nome);

	}

}
