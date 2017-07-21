package alura.java01.arrays;

import alura.java01.arrays.Funcionario;

public class TestaEmpresa {

	public static void main(String[] args) {
		
		Empresa em = new Empresa(10);
		em.setNome("Xorg");
		em.setCnpj("124545.6464.654654-6546");
		
		Funcionario f1 = new Funcionario();
		f1.setNome("Hugo");
		f1.recebeAumento(100.0);
		f1.setDepartamento("dev");
		
		
		Funcionario f2 = new Funcionario();
		f2.setNome("M�rcia");
		f2.recebeAumento(550);
		f2.setDepartamento("rh");
		
		em.adiciona(f1);
//		em.adiciona(f2);
		
		for(int i = 0; i < 5; i++) {
			Funcionario f = new Funcionario();
			f.setNome("Nome" + i);
			f.recebeAumento(i * 100);
			em.adiciona(f);
		}
		
		em.mostraFuncionariosCompleto();
//		em.mostraFuncionarios();
		
		System.out.println("O funcion�rio '" + f1.getNome() + "' trabalha na empresa? " + em.contem(f1));
		System.out.println("O funcion�rio '" + f2.getNome() + "' trabalha na empresa? " + em.contem(f2));
		
		Funcionario f6 = em.getFuncionario(0);
		System.out.println("Nome do funcionario pesquisado");
		System.out.println(f6.getNome());
		
		System.out.println("N�mero de funcion�rios");
		System.out.println(Funcionario.getId());
		
	}

}
