package clinicaVeterinaria;

public class Cachorro extends Animal{

    protected String raca;

    public Cachorro(String raca) {
        setRaca(raca);
    }

    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        setRaca(raca);
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (raca != null && !raca.trim().isEmpty()){
            this.raca = raca;
        }
    }

    @Override
    public void imprimeInfo(){
        System.out.println("=== CACHORRO ===");
        System.out.println("Raça: "+getRaca());
        super.imprimeInfo();

    }

}
