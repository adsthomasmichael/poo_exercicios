package com.aula01;

public class aula01 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "Esferográfica";
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		
		c1.tampar();
		c1.status();
		c1.rabiscar();
		
		Caneta c2 = new Caneta();
		c2.modelo = "Negrada";
		c2.cor = "Vermelha";
		
		c2.destampar();
		c2.status();
		c2.rabiscar(); 

		Instrumento i1 = new Instrumento();
		i1.nomeInstrumento = "Violão";
		i1.harmonia = true;
		
		i1.status();
		i1.tocar();
		
		Instrumento i2 = new Instrumento();
		i2.nomeInstrumento = "Surdão de 1°";
		i2.harmonia = false;
		
		i2.status();
		i2.tocar(); 
		
		Carro ca01 = new Carro();
		ca01.fabricante = "Cherry";
		ca01.modelo = "Celler";
		ca01.cor = "Preto";
		ca01.motor = 1.0;
		ca01.portas = 4;
		ca01.arCondicionadoLigado = true;
		
		ca01.status();
		ca01.sobeLomba();
		
		/* Gato g1 = new Gato();
		g1.nome = "D'Ale";
		g1.cor = "Preto";
		g1.idade = 9;
		g1.fome = false;
		
		g1.status();
		g1.mia();
		
		Gato g2 = new Gato();
		g2.nome = "Angola";
		g2.cor = "Preto e branco";
		g2.idade = 3;
		g2.fome = true;
		
		g2.status();
		g2.mia();		
		
		Gato g3 = new Gato();
		g3.nome = "Cido";
		g3.cor = "Branco e Cinza";
		g3.idade = 18;
		g3.fome = true;
		
		g3.status();
		g3.mia(); 
		
		Animal animal01 = new Animal();
		animal01.tipo = "gato";
		animal01.nome = "D'Alessandro";
		animal01.idade = 9;
		
		animal01.status();
		animal01.comportamento();
		
		Animal animal02 = new Animal();
		animal02.tipo = "cachorro";
		animal02.nome = "Naldo";
		animal02.idade = 6;
		
		animal02.status();
		animal02.comportamento(); 
		
		Musica m01 = new Musica();
		m01.nome = "Se o Samba começar!";
		m01.duracao = 3.42;
		m01.estilo = "samba";
		m01.ritmoAcelerado = false;
		
		m01.status();
		m01.acao(); */
		

	}

}
