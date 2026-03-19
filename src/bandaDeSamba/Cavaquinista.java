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
		
		public String nivelMusicalCavaco() {
			
			if (this.idade >= 35 && this.tempoCarreira >= 20 && this.pontuacaoNivel >= 9) {
			    return "seu nível musical é Cavaco SÊNIOR.";

			} else if (this.idade >= 25 && this.tempoCarreira >= 10 && this.pontuacaoNivel > 7) {
			    return "seu nível musical é Cavaco PLENO.";

			} else if (this.idade < 25 && this.tempoCarreira < 10 && this.pontuacaoNivel <= 7) {
			    return "seu nível musical é Cavaco JUNIOR.";
			}

			return "Nível não identificado.";
			
		}
		
		
		public void statusCavaquinista() {
			
			System.out.printf("O Cavaquinista se chama %s, tem %d anos de idade e %d anos de carreira. \n"+
							getNome() + getIdade() + tempoCarreira
							);
			
			if( estiloLevada.length() > 0) {
				System.out.printf("Seu estilo de levada é %s e sua pontuação de nível musical é %.1f. \n" +
									getEstiloLevada() +
									getPontuacaoNivel()
									);
			}
			
			System.out.print(nivelMusicalCavaco());
			
		}
			

		// Métodos de acesso - GET - busca e retorno
			
			public String getNome() {
				return nome;
			}
			
			public String getSexo() {
				return sexo;
			}
			
			public int getIdade() {
				return idade;
			}
			
			public int getTempoCarreira() {
				return tempoCarreira;
			}
			
			public double getPontuacaoNivel() {
				return pontuacaoNivel;
			}
			
			public String getEstiloLevada() {
				return estiloLevada;
			}
			
			
	// Métodos de acesso - SET - alteração de valor do atributo
			
			public void setNome( String novoNome) {
				this.nome = novoNome;
			}
			
			public void setSexo( String novoSexo) {
				this.sexo = novoSexo;
			}
			
			public void setIdade( int novaIdade) {
				this.idade = novaIdade;
			}
			
			public void setTempoCarreira( int novoTempoCarreira) {
				this.tempoCarreira = novoTempoCarreira;
			}
			
			public void setPontuacaoNivel( double novaPontuacaoNivel) {
				this.pontuacaoNivel = novaPontuacaoNivel;
			}
			
			public void setEstiloLevada( String novoestiloLevada) {
				this.estiloLevada = novoestiloLevada;
			}
			
			
}
	

	


