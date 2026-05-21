package SistemaDeFilmes;

import com.utils.Teclado;

public class Principal {

	public static void main(String[] args) {
		//Crie um catálogo com tamanho aleatório entre 1 e 50.
		Catalogo catalogo01 = new Catalogo((int)(Math.random() * 50 + 1));
		
		//Sorteie um valor entre 1 e 80 chamado quant
		int quant = (int)(Math.random() * 80 + 1);
		
		/*Tente inserir quant filmes. Sorteie entre 1 e 2. Se for 1 → crie um Acao. Se for 2 → crie um Drama. As informações devem ser aleatórias. */
		for( int i = 0; i < quant; i++) {
			
			int tipoFilme = (int)(Math.random() * 2 + 1); //Sorteio tipo de filme
			
			//Dados comuns de filme
			String titulo = "Filme "+ i;
			String diretor = "Diretoção "+ i;
			double duracao = (int)(Math.random() * 60 + 180);
			int ano = (int)(Math.random() * 126 + 1900);
			
			boolean inseriu;
			
			if( tipoFilme == 1) { //cria filme de ação
				int qtdExplosoes = (int)(Math.random() * 50);
				Acao filmeAcao = new Acao(
						titulo,
						diretor,
						duracao,
						ano,
						qtdExplosoes
				);
				inseriu = catalogo01.insereFilme(filmeAcao);
				
			}
			else {
				boolean oscar;
				int opcaoOscar = (int)(Math.random()* 1 + 2);
					if(opcaoOscar == 1) {
						oscar = true;
					}
					else { //cria filme de drama
						oscar = false;
					}
				Drama filmeDrama = new Drama(
						titulo,
						diretor,
						duracao,
						ano,
						oscar
				);
				inseriu = catalogo01.insereFilme(filmeDrama);
			}
			// Informa o resultado da inserção
		    if (inseriu) {
		        System.out.println("FIlme inserido com sucesso.");
		    } else {
		        System.out.println("Não foi possível inserir o filme.");
		    }
		}
		
		
		//Solicite um título ao usuário. Se encontrar o filme → imprima. Caso contrário → mensagem de erro.
		
		String tituloProcurado = Teclado.leString("Qual o titulo do filme que deseja procurar?");
			Filme filme = catalogo01.procuraFilmePorTitulo(tituloProcurado);
				if( filme != null) {
					System.out.println(filme);
				}
				else {
					System.out.println("Erro! Filme não encontrado.");
				}
				
	}

}
