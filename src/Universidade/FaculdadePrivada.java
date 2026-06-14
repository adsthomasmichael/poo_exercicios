package Universidade;

public class FaculdadePrivada extends Faculdade{

    protected String grupoEmpresarial;

    public FaculdadePrivada(String nome, String cidade, double orcamentoBruto, double orcamentoLiquido, int qtdProfessores, String grupoEmpresarial) {
        super(nome, cidade, orcamentoBruto, orcamentoLiquido, qtdProfessores);
        this.grupoEmpresarial = grupoEmpresarial;
    }

    public String getGrupoEmpresarial() {
        return grupoEmpresarial;
    }

    public void setGrupoEmpresarial(String grupoEmpresarial) {
        this.grupoEmpresarial = grupoEmpresarial;
    }
}
