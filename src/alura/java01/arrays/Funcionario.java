package alura.java01.arrays;

import alura.java01.arrays.Data;

public class Funcionario {
	

	private String nome = "Não cadastrado";

	private String departamento = "Não cadastrado";

	private Data dataEntrada = new Data(10, 5, 1999);

	private String rg = "Não cadastrado";

	private double salario = 0.0;
	
	private static int id;
	
	public Funcionario() {
		Funcionario.id++;
	}
	
	public Funcionario(String nome) {
		this.nome = nome;
		Funcionario.id++;
	}
	
	public static int getId() {
		return Funcionario.id;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Data getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public double getSalario() {
		return salario;
	}

	public void recebeAumento(double aumento) {
		this.salario += aumento;
	}

	public double calculaGanhoAnual() {
		return this.salario * 12;
	}
	
	public void mostra() {
		System.out.println("---------------------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		
//		System.out.println("Data de Inicio: " + this.dataEntrada.getFormatada());
		
		System.out.println("RG: " + this.rg);
		System.out.println("Salário: " + this.salario);
		System.out.println("---------------------------------");
	}
	
	public boolean souEu(Funcionario f){
		if(!this.nome.equals(f.nome)){
			return false;
		}
		if(!this.departamento.equals(f.departamento)){
			return false;
		}
//		if(!this.dataEntrada.equals(f.nome)){
//			return false;
//		}
		if(!this.rg.equals(f.rg)){
			return false;
		}
		if(!(this.salario == f.salario)){
			return false;
		}
		
		
		return true;
	}

}
