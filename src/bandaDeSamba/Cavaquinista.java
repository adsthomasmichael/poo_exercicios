package bandaDeSamba;

public class Cavaquinista {
	
		// declaração dos atributos
		
		private String nome;
		private String sexo;
		private int idade;
		private int tempoCarreira;
		private double pontuacaoNivel;
		private String estiloLevada; // Chorinho - Partido Alto - Dolente - Pagodinho
		
		
		// Método construtor:
		
		public Cavaquinista (String nome, int idade, int tempoCarreira, double pontuacaoNivel) {
			this.nome = nome;
			this.idade = idade;
			this.tempoCarreira = tempoCarreira;
			this.pontuacaoNivel = pontuacaoNivel;
		}
		
		
		// decaração de métodos
		
		public void nivelMusicalCavaco() {
			
			if( this.idade < 25 && this.tempoCarreira < 10 && this.pontuacaoNivel <= 7) {
				System.out.println("e seu nivel musical é Cavaco JUNIOR.");
				
			} else if( this.idade >= 25 && this.tempoCarreira >= 10 && this.pontuacaoNivel > 7) {
				System.out.println("e seu nivel musical é Cavaco PLENO.");
				
			} else if( this.idade >= 35 && this.tempoCarreira >= 20  && this.pontuacaoNivel >= 9) {
				System.out.println("e seu nivel musical é Cavaco SÊNIOR.");
			
			}
			
		}
		
		// metodos de public void statusCavaquinista() {
			
		}
	

	}


