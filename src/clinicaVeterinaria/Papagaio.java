package clinicaVeterinaria;

public class Papagaio extends Animal{
    protected int vocabulario;

    public Papagaio() {}

    public Papagaio(String nome, int idade, int vocabulario) {
        super(nome, idade);
        this.vocabulario = vocabulario;
    }

    public int getVocabulario() {
        return vocabulario;
    }

    public void setVocabulario(int vocabulario) {
        this.vocabulario = vocabulario;
    }

    @Override
    public void imprimeInfo(){
        System.out.println("=== PAPAGAIO ===");
        System.out.println("Vocabulario: "+ getVocabulario());
        super.imprimeInfo();
    }
}
