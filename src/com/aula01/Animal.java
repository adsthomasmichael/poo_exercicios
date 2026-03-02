package com.aula01;

public class Animal {

	String nome;
	String tipo;
	String som;
	int idade;
	
	void status() {
		System.out.println("O animal é um " + this.tipo);
		System.out.println("Chamado " + this.nome);
		System.out.println("Que tem " + this.idade + " anos");
		
	}
	
	void comportamento() {
		if( this.tipo.equals("cachorro") ) {
			som = "late";
			System.out.println("E quando está com fome, ele " + this.som);
		}else if( this.tipo.equals("gato")) {
			som = "mia";
			System.out.println("E quando está com fome, ele " + this.som);
		}
	}
	

}
