package Universidade;

public class FaculdadePublica extends Faculdade {

    protected int codMEC;

    public FaculdadePublica(String nome, String cidade, double orcamentoBruto, double orcamentoLiquido, int qtdProfessores, int codMEC) {
        super(nome, cidade, orcamentoBruto, orcamentoLiquido, qtdProfessores);
        this.codMEC = codMEC;
    }

    public int getCodMEC() {
        return codMEC;
    }

    public void setCodMEC(int codMEC) {
        this.codMEC = codMEC;
    }
}
