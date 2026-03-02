package com.aula01;

public class Instrumento {
	
	String nomeInstrumento;
	String tipoIntrumento;
	boolean harmonia;
	
	void tocar() {
		if (this.harmonia == true) {
			System.out.println("Vou tocar na HARMONIA da escola!");
		} else {
			System.out.println("Vou tocar na BATERIA da escola");
		}
		
	}
	
	void status() {
		System.out.println("Nome do Instrumento: " + this.nomeInstrumento);
		System.out.println("Tipo de Instrumento: " + this.tipoIntrumento);
		System.out.println("Harmonico?" + this.harmonia);
	}
	
	

}
