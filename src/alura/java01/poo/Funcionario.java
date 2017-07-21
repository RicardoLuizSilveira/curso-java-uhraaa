package alura.java01.poo;

import alura.java01.poo.Data;

public class Funcionario {

	String nome = "Não cadastrado";

	String departamento = "Não cadastrado";

	Data dataEntrada = new Data();

	String rg = "Não cadastrado";

	double salario = 0.0;

	boolean trabalhando = false;

	void recebeAumento(double aumento) {
		this.salario += aumento;
	}

	double calculaGanhoAnual() {
		return this.salario * 12;
	}

	void mostra() {
		System.out.println("---------------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		
		System.out.println("Data de Inicio: " + this.dataEntrada.getFormatada());
		
		System.out.println("RG: " + this.rg);
		System.out.println("Salário: " + this.salario);
		System.out.println("Trabalhando agora: " + this.trabalhando);
		System.out.println("---------------------------------");
	}

}
