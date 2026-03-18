package com.aula01;

public class Carro {

		
		String modelo;
		String fabricante;
		String cor;
		int portas;
		double motor;
		boolean arCondicionadoLigado;
		
		public void status() {
			System.out.println("O Carro é o "+ this.fabricante + this.modelo);
			System.out.println("da cor "+ this.cor + " e com "+ this.portas + " portas.");
			System.out.println("Se o motor é "+ this.motor);
			System.out.println("e se o ar condicionado está ligado?"+ this.arCondicionadoLigado);
				
		}
		
		
		public void sobeLomba() {
			if( this.motor == 1.0 && this.arCondicionadoLigado == true) {
				System.out.println("Uhmmm.....não vai subir não hein");
			}else {
				System.out.println("Sobe! Claaaro que sobe!");
			
			}
		
		
	}

}
	

