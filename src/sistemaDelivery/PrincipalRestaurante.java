package sistemaDelivery;

import com.utils.Teclado;


public class PrincipalRestaurante {

	public static void main(String[] args) {
		
		//No main: Criar restaurante (via teclado)
		Restaurante restaurante = new Restaurante(Teclado.leString("Informe o nome do restaurante: "));
		
		//Criar pelo menos 4 produtos
		Produto[] produtos = {
				new Produto("Feijoada Wakanda", "Almoço", 49.90),
				new Produto("Dobradinha Zamunda", "Almoço", 49.90),
				new Produto("Acarajé Harlem", "Lanche", 19.90),
				new Produto("Sanduba Tupiniquim", "Lanche", 29.90),
				new Produto("Refrigeréco", "Bebida", 12.90),
				new Produto("Kisuko", "Bebida", 9.90),
		};
		
		//Criar 4 clientes (misturar VIP e normal)
		
		Cliente[] clientes = {
				new Cliente("Michael Thomas", "Beco do Rato 10, centro - RJ"),
				new Cliente("Luís Eduardo", "Rua Barão do Cotegipe 40 - Niteroi"),
				new Cliente("Angolinha Jardim", "Av Principal 300 - Gloria"),
				new Cliente("D'Ale da Silva", "Av Beira-rio 10 - Vitoria")
		};
		
		clientes[0].setVip(true);
		clientes[2].setVip(true);
		
		/* Fazer vários pedidos:
				com 1 produto, com 2 produtos, com 3 produtos. Para cada pedido: imprimir resumo e mostrar valor total */


			Pedido p1 = restaurante.realizarPedido(clientes[0], produtos[0], produtos[3],produtos[5]);
			Pedido p2 = restaurante.realizarPedido(clientes[1], produtos[1]);
			Pedido p3 = restaurante.realizarPedido(clientes[2], produtos[3], produtos[4]);
			Pedido p4 = restaurante.realizarPedido(clientes[3], produtos[3], produtos[5]);
			
			if(p1 != null) p1.exibirResumo();
			if(p2 != null) p2.exibirResumo();
			if(p3 != null) p3.exibirResumo();
			if(p4 != null) p4.exibirResumo();
			
			/* metodo com 
			 * Pedido[] pedidos = {
				    restaurante.realizarPedido(clientes[0], produtos[0], produtos[3], produtos[5]),
				    restaurante.realizarPedido(clientes[1], produtos[1]),
				    restaurante.realizarPedido(clientes[2], produtos[3], produtos[4]),
				    restaurante.realizarPedido(clientes[3], produtos[3], produtos[5])
				};
				
				for (Pedido p : pedidos) {
				    if (p != null) {
				        p.exibirResumo();
				        System.out.println("---------------------");
				    }
				} */
		// Mostrar total arrecadado do restaurante
			
			restaurante.exibirInformacoes();
			
			
	}

}
