package clinicaVeterinaria;

import com.utils.Teclado;

public class Teste {
    public static void main(String[] args){

        Cachorro c01 = new Cachorro("Rex", 5,"Golden Retriever");
        Consulta consulta = new Consulta("Vacinação anual", new Data(15,8,2026));
        Gato g01 = new Gato("Mimi", 3, 4.8, consulta);

        c01.imprimeInfo();
        g01.imprimeInfo();

        consulta.setData(new Data(15,12,2026));
        g01.imprimeConsulta();
        
        Animal a = null;
        
        int opcao = Teclado.leInt("Digite 1 para CACHORRO, 2 para GATO ou 3 para PAPAGAIO: ");
        
        	if( opcao == 1) {
        		a = new Cachorro(Teclado.leString("Qual o nome do Cachorro?"), Teclado.leInt("QUal a idade do cachorro?"), Teclado.leString("Qual a raça do cachorro?"));
        		Cachorro ca1 = (Cachorro) a;
        		ca1.setRaca("LAbrador");
        	}
        	else if( opcao == 2) {
        		a = new Gato(Teclado.leString("Qual o nome do Gato?"), Teclado.leInt("Qual a idade do Gato"), Teclado.leDouble("Qual o peso do gato?"), consulta);
        		Gato ga1 = (Gato) a;
        		ga1.setPeso(6.1);
        	} else if ( opcao == 3) {
                a = new Papagaio();
                    a.setNome(Teclado.leString("Informe o nome do Papagaio: "));
                    a.setIdade(Teclado.leInt("Qual a idade do Papagaio? "));
                    Papagaio p001 = (Papagaio) a;
                    p001.setVocabulario(Teclado.leInt("Quantas palavras compõe seu vocabulario?"));
            }

        InformacoesAnimais info = new InformacoesAnimais();
        	info.imprimeExclusivosAnimal(a);
        	info.imprimeInformacoesAnimal(a);
        	

    }
}
