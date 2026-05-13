package clinicaVeterinaria;

public class Gato extends Animal{

    protected double peso;
    protected Consulta consulta;

    public Gato(String nome, int idade, double peso, Consulta consulta) {
        super(nome, idade);
        setPeso(peso);
        this.consulta = consulta;
    }

    public Gato() {
        super();

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0){
            this.peso = peso;
        }
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    public void imprimeConsulta(){
        consulta.imprimeConsulta();
    }

    @Override
    public void imprimeInfo(){
        System.out.println("=== GATO ===");
        super.imprimeInfo();
        System.out.println("Peso: "+getPeso());
        imprimeConsulta();
    }
}
