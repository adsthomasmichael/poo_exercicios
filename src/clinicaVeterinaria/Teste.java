package clinicaVeterinaria;

public class Teste {
    public static void main(String[] args){

        Cachorro c01 = new Cachorro("Rex", 5,"Golden Retriever");
        Consulta consulta = new Consulta("Vacinação anual", new Data(15,8,2026));
        Gato g01 = new Gato("Mimi", 3, 4.8, consulta);

        c01.imprimeInfo();
        g01.imprimeInfo();



    }
}
