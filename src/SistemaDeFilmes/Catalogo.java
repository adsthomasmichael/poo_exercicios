package SistemaDeFilmes;

import java.util.Arrays;

public class Catalogo {
	
	protected Filme[] arrayCatalogo;

	
	public Catalogo(int tamanhoCatalogo) {
		
		this.arrayCatalogo = new Filme[tamanhoCatalogo];
	}


	public Filme[] getArrayCatalogo() {
		return arrayCatalogo;
	}


	public void setArrayCatalogo(Filme[] arrayCatalogo) {
		this.arrayCatalogo = arrayCatalogo;
	}


	@Override
	public String toString() {
		return "Catalogo [arrayCatalogo=" + Arrays.toString(arrayCatalogo) + "]";
	}
	
	public boolean insereFilme( Filme filme) {
		
		for( int i = 0; i < arrayCatalogo.length; i++) {
			if( arrayCatalogo[i] == null) {
				arrayCatalogo[i] = filme;
				return true;
			}
			
		}
		return false;
		
	}
	
	public Filme procuraFilmePorTitulo(String tituloProcurado) {
		
		for( int i = 0; i < arrayCatalogo.length; i++) {
			if(arrayCatalogo[i] != null && arrayCatalogo[i].getTitulo().equals(tituloProcurado)) {
				return arrayCatalogo[i];
			}
		}
		return null;
	}
	
	public void imprimeFilmesOscar() {
		
		for( int i = 0; i < arrayCatalogo.length; i++) {
			if( arrayCatalogo[i] != null &&
				arrayCatalogo[i] instanceof Drama) {
				Drama ehDrama = (Drama) arrayCatalogo[i];
				System.out.println(ehDrama);
			}
		}
	}

	public double calculaMediaDuracao() {
		
	int qtdFilmes = 0;
	double somaDuracao = 0;
	
		for( int i = 0; i < arrayCatalogo.length; i++) {
			if( arrayCatalogo[i] != null) {
				qtdFilmes++;
				somaDuracao += arrayCatalogo[i].getDuracao();
			}
			if( qtdFilmes == 0) {
				return 0;
			}
		}
		return somaDuracao / qtdFilmes;
	}
	
	public Filme filmeComMaiorTitulo() {
	
	int tamanhoString = 0;
	Filme filmeTituloMaior = null;
		
		for( int i = 0; i < arrayCatalogo.length; i++) {
			if( arrayCatalogo[i].getTitulo().length() > tamanhoString ) {
				tamanhoString = arrayCatalogo[i].getTitulo().length();
				filmeTituloMaior = arrayCatalogo[i]; 
			}
		}
		return filmeTituloMaior;
	}
	
	

}
