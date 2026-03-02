package com.aula01;

public class Gato {

	String nome;
	String cor;
	int idade;
	boolean fome;
	
	void status() {
		System.out.println("Nome do Gato: " + this.nome);
		System.out.println("de Cor: " + this.cor);
		System.out.println("Tem " + this.idade + " anos.");
		System.out.println("Tá com fome? " + this.fome);
	}
	
	void mia() {
		if ( this.fome == true) {
			System.out.println("MiauuuuuuU! MiauUuuu");
		} else {
			System.out.println("zzZZzzzzzzZZZzz...");
		}
	}
	
	

}
