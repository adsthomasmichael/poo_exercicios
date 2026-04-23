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
		
		if (cliente == null || produto01 == null) {
            return null; // pedido inválido
        }
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
	
	public Pedido realizarPedido(Cliente c1, Produto p1) { //sobrecarga 1
		
		return realizarPedido(c1, p1, null, null);
	}
	
	public Pedido realizarPedido(Cliente c2, Produto p1, Produto p2) {// sobrecarga 2
		
		return realizarPedido(c2, p1, p2, null);
	}
	
	public void exibirInformacoes() {
        System.out.println("=== Restaurante ===");
        System.out.println("Nome             : " + nome);
        System.out.printf("Total arrecadado : R$ %.2f%n", totalArrecadado);
    }
	
	

}
