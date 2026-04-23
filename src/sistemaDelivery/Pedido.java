package sistemaDelivery;


public class Pedido {
	/* Um pedido possui:
		um cliente, até 3 produtos, valor total, status (ex: “criado”, “em preparo”, “entregue”) */
	
	private Cliente cliente;
	private Produto produto01;
	private Produto produto02;
	private Produto produto03;
	private double valorTotal;
	private String status;

	/* O valor total deve ser calculado com base nos produtos
			Crie: construtores: 1 produto 2 produtos 3 produtos, getters, método calcularTotal() método exibirResumo() */
	
	public Pedido( Cliente cliente, Produto produto01) {
		this.cliente = cliente;
		this.produto01 = produto01;
		this.valorTotal = 0;
		this.status = "criado";
	}
	
	public Pedido( Cliente cliente, Produto produto01, Produto produto02) {
		this.cliente = cliente;
		this.produto01 = produto01;
		this.produto02 = produto02;
		this.valorTotal = 0;
		this.status = "criado";		
	}
	
	public Pedido( Cliente cliente, Produto produto01, Produto produto02, Produto produto03) {
		setCliente(cliente);
		this.produto01 = produto01;
		this.produto02 = produto02;
		this.produto03 = produto03;
		this.valorTotal = 0;
		this.status = "criado";
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		if( cliente != null) {
			this.cliente = cliente;
		}
		
	}

	public Produto getProduto01() {
		return produto01;
	}

	public void setProduto01(Produto produto01) {
		this.produto01 = produto01;
	}

	public Produto getProduto02() {
		return produto02;
	}

	public void setProduto02(Produto produto02) {
		this.produto02 = produto02;
	}

	public Produto getProduto03() {
		return produto03;
	}

	public void setProduto03(Produto produto03) {
		this.produto03 = produto03;
	}

	public double getValorTotal() {
		
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		
		this.valorTotal = valorTotal;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if (status != null && !status.trim().isEmpty()) {
		this.status = status;		
		}
	}
	
	public double calcularTotal() {
		double somaValores = 0;
		
		if(produto01.getPreco() > 0) {
			somaValores += produto01.getPreco();
		}
		else if( produto02.getPreco() > 0) {
			somaValores += produto02.getPreco();
		}
		else if( produto03.getPreco() > 0) {
			somaValores += produto03.getPreco();
		}
		
	setValorTotal(somaValores);	
	return somaValores;
	}
	
	public void exibirResumo() {
		System.out.println("=== RESUMO PEDIDO === \n");
		System.out.println(cliente.toString());
		
		if(produto01 != null) {
			System.out.println(produto01.toString());
		}
		if(produto02 != null) {
			System.out.println(produto02.toString()); 
		}
		if(produto03 != null) {
			System.out.println(produto03.toString());	
		}
	System.out.println("");
	System.out.println("Valor Total  : "+ getValorTotal());
	System.out.println("Status pedido: "+getStatus());
	
	}
	
	
}
