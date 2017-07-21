package alura.java01.arrays;

import alura.java01.arrays.Funcionario;

public class Empresa {

	private String nome = "Não definido";

	private String cnpj = "Não definido";

	private Funcionario[] funcionarios;;

	private int numeroDeFuncionarios = 0;
	
	public Empresa(int tamanho) {
		this.funcionarios = new Funcionario[tamanho];
	}

	public void adiciona(Funcionario funcionario) {

		this.funcionarios[numeroDeFuncionarios] = funcionario;

		this.numeroDeFuncionarios++;

	}

	public void mostraFuncionarios() {
		for (Funcionario f : funcionarios) {
			if (f == null) {
				continue;
			}
			System.out.println("Nome: " + f.getNome());
			System.out.println("Salário: " + f.getSalario());
		}
	}
	
	public Funcionario getFuncionario(int posicao) {
		if(numeroDeFuncionarios >= posicao) {
			return funcionarios[posicao];
		}
		return null;
	}

	public void mostraFuncionariosCompleto() {
		for (int i = 0; i < numeroDeFuncionarios; i++) {
			System.out.println("Funcionário n. " + i);
			funcionarios[i].mostra();
		}
	}

	public boolean contem(Funcionario f) {
		for (int i = 0; i < numeroDeFuncionarios; i++) {
			if (funcionarios[i].souEu(f)) {
				return true;
			}
		}
		return false;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public int getNumeroDeFuncionarios (){
		return numeroDeFuncionarios;
	}
	
	

}
