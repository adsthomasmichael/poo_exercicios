package SistemaDeFilmes;

public class Filme {
	
	protected String titulo;
	protected String diretor;
	protected double duracao;
	protected int ano;
	
	public Filme() {}
	
	public Filme(String titulo, String diretor, double duracao, int ano) {
	
		this.titulo = titulo;
		this.diretor = diretor;
		this.duracao = duracao;
		this.ano = ano;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", diretor=" + diretor + ", duracao=" + duracao + ", ano=" + ano + "]";
	}
	
	
	
	

}
