package com.aula01;

public class Musica {

	String nome;
	String estilo;
	double duracao;
	boolean ritmoAcelerado;
	
	void status() {
		System.out.println("A musica chamada " + this.nome);
		System.out.println("Do estilo " + this.estilo);
		System.out.println("Dura " + this.duracao);
		System.out.println("Seu ritmo é acelerado? " + this.ritmoAcelerado);
		
	}
	
	void acao() {
		if (this.ritmoAcelerado == true || this.estilo.equals("samba")) {
		/*} else if ( this.estilo.equals("samba")) {*/
			System.out.println("Então eu vou dançar!"); 
		} else {
			System.out.println("Então NÃO vou dançar.");
		}
		
	}

}
