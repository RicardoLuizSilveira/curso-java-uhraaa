package alura.java01.arrays;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		System.out.println(Funcionario.getId());
		
		Funcionario f = new Funcionario();
		
		System.out.println("Nome:");
		f.setNome("Hugo");
		System.out.println(f.getNome());
		
		System.out.println("Departamento:");
		f.setDepartamento("dev");
		System.out.println(f.getDepartamento());
		
		System.out.println("salário:");
		f.recebeAumento(500.0);
		System.out.println(f.getSalario());
		System.out.println("salário anual:");
		System.out.println(f.calculaGanhoAnual());
		
		System.out.println(Funcionario.getId());
		
	}

}
