package sistemaDelivery;

public class Restaurante {
	
	private String nome;
	private double totalArrecadado;
	
	public Restaurante(String nome) {
		setNome(nome);
		this.totalArrecadado = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome != null && !nome.trim().isEmpty()) { //validaçao nome nulo e vazio
			this.nome = nome;
		}
	}

	public double getTotalArrecadado() {
		return totalArrecadado;
	}

	public void setTotalArrecadado(double totalArrecadado) {
		this.totalArrecadado = totalArrecadado;
	}
	
	public Pedido realizarPedido(Cliente cliente, Produto produto01, Produto produto02, Produto produto03) {
		
		double somaBase = 0; 
		
		//soma dos produtos
		if(produto01 != null) {somaBase += produto01.getPreco();}
		if(produto02 != null) {somaBase += produto02.getPreco();}
		if(produto03 != null) {somaBase += produto03.getPreco();}
	
		//Cliente VIP → 10% de desconto
		if( cliente.isVip()) { 
			somaBase *= 0.90;
		}
		// Se tem bebida → +5%
		if( produto01.getCategoria().contains("Bebida")) {//Pedido com bebida → +5% de taxa
			somaBase *= 1.05;
		}
		if( produto02.getCategoria().contains("Bebida")) {//Pedido com bebida → +5% de taxa
			somaBase *= 1.05;
		}
		if ( produto03.getCategoria().contains("Bebida")) {//Pedido com bebida → +5% de taxa
			somaBase *= 1.05;
		}
		//Pedido acima de R$100 → 10% de desconto adicional
		if (somaBase > 100) { 
			somaBase *= 0.90;
		}
		// Se endereço contém “Centro” → frete grátis, Senão → + R$10
		if( !cliente.getEndereco().contains("Centro")) { 
			somaBase += 10;
		}
		// Atualiza total do restaurante
		totalArrecadado += somaBase;
		
		// Cria pedido
		Pedido pedido = new Pedido( cliente, produto01, produto02, produto03);
		pedido.setValorTotal(somaBase);
		return pedido;
	}
	
	

}
