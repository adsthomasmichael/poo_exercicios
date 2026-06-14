package Universidade;

public class Faculdade {

    protected String nome;
    protected String cidade;
    protected double orcamentoBruto;
    protected double orcamentoLiquido;
    protected Professor[] arrayProfessores;

    public Faculdade(String nome, String cidade, double orcamentoBruto, double orcamentoLiquido, int qtdProfessores) {
        this.nome = nome;
        this.cidade = cidade;
        this.orcamentoBruto = orcamentoBruto;
        this.orcamentoLiquido = orcamentoLiquido;
        this.arrayProfessores = new Professor[qtdProfessores];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getOrcamentoBruto() {
        return orcamentoBruto;
    }

    public void setOrcamentoBruto(double orcamentoBruto) {
        this.orcamentoBruto = orcamentoBruto;
    }

    public double getOrcamentoLiquido() {
        return orcamentoLiquido;
    }

    public void setOrcamentoLiquido(double orcamentoLiquido) {
        this.orcamentoLiquido = orcamentoLiquido;
    }

    public Professor[] getArrayProfessores() {
        return arrayProfessores;
    }

    public void setArrayProfessores(Professor[] arrayProfessores) {
        this.arrayProfessores = arrayProfessores;
    }
}
