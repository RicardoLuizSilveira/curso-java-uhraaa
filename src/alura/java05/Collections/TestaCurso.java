package alura.java05.Collections;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso cursoCollections = new Curso("Java", "Joao");
		
		List<Aula> aulas = cursoCollections.getAulas();
		
		System.out.println(aulas);
		
//		cursoCollections.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
//		cursoCollections.getAulas().add(new Aula("Colections List", 15));

		cursoCollections.adiciona(new Aula("Trabalhando com ArrayList", 21));
		cursoCollections.adiciona(new Aula("Criando uma aula", 20));
		cursoCollections.adiciona(new Aula("Modelando com coleções", 24));
		
//		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
	}

}
