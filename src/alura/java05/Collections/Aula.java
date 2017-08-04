package alura.java05.Collections;

public class Aula  implements Comparable<Aula>{

	private String titulo;
	private int tempo;
	
	public Aula(String nomeDaAula, int tempoDeDuracao) {
		super();
		this.titulo = nomeDaAula;
		this.tempo = tempoDeDuracao;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[Nome da Aula: " + titulo + ", duração: " + tempo + " minutos]");
		return sb.toString();
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
}
