package alura.java01.poo;

import alura.java01.poo.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		f1.nome = "Hugo";
		f1.salario = 100;
		f1.departamento = "dev";
		f1.trabalhando = true;
		f1.recebeAumento(50);
		
		 
		
		f1.dataEntrada.preencheData(11, 6, 1999);
		
		
		System.out.println("Salário atual: " + f1.salario);
		System.out.println("Ganho anual: " + f1.calculaGanhoAnual());
		
		f1.mostra();
		
	}

}
