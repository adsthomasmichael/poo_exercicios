package SistemaDeFilmes;

public class Acao extends Filme {

	protected int quantidadeExplosoes;

	public Acao() {
		super();
		
	}

	public Acao(String titulo, String diretor, double duracao, int ano, int quantidadeExplosoes) {
		super(titulo, diretor, duracao, ano);
		this.quantidadeExplosoes = quantidadeExplosoes;
	}

	public int getQuantidadeExplosoes() {
		return quantidadeExplosoes;
	}

	public void setQuantidadeExplosoes(int quantidadeExplosoes) {
		this.quantidadeExplosoes = quantidadeExplosoes;
	}

	@Override
	public String toString() {
		return super.toString() + ", Acao [quantidadeExplosoes=" + quantidadeExplosoes + "]";
	}
	
	
	
}
