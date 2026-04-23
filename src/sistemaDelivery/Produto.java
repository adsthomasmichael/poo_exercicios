package sistemaDelivery;

public class Produto {

	private String nome;
	private String categoria;
	private double preco;
	
	public Produto (String nome, String categoria, double preco) {
		setNome(nome);
		setCategoria(categoria);
		setPreco(preco);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null && !nome.trim().isEmpty()) { //validaçao nome nulo e vazio
			this.nome = nome;
		}
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		if(categoria != null && !categoria.trim().isEmpty()) {
			this.categoria = categoria;	
		}
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if( preco >= 0) {
			this.preco = preco;
		}
		
	}
	
	@Override
	public String toString() {
		return nome + " (" + categoria + ") - R$ " + String.format("%.2f", preco);
	}
}
