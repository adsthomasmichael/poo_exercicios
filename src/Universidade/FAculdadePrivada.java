package Universidade;

public class FAculdadePrivada extends Faculdade{

    protected String grupoEmpresarial;

    public FAculdadePrivada(String nome, String cidade, double orcamentoBruto, double orcamentoLiquido, int qtdProfessores, String grupoEmpresarial) {
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
