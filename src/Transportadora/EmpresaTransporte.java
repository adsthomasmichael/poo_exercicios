package Transportadora;


public class EmpresaTransporte {

    protected String nome;
    protected String numCNPJ;
    protected double faturamentoBruto;
    protected  double faturamentoLiquido;
    protected Motorista[] arrayMotoristas;

    public EmpresaTransporte() {
    }

    public EmpresaTransporte(String nome, String numCNPJ, double faturamentoBruto, double faturamentoLiquido, int qntMotoristas) {
        this.nome = nome;
        this.numCNPJ = numCNPJ;
        this.faturamentoBruto = faturamentoBruto;
        this.faturamentoLiquido = faturamentoLiquido;
        this.arrayMotoristas = new Motorista[qntMotoristas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumCNPJ() {
        return numCNPJ;
    }

    public void setNumCNPJ(String numCNPJ) {
        this.numCNPJ = numCNPJ;
    }

    public double getFaturamentoBruto() {
        return faturamentoBruto;
    }

    public void setFaturamentoBruto(double faturamentoBruto) {
        this.faturamentoBruto = faturamentoBruto;
    }

    public double getFaturamentoLiquido() {
        return faturamentoLiquido;
    }

    public void setFaturamentoLiquido(double faturamentoLiquido) {
        this.faturamentoLiquido = faturamentoLiquido;
    }

    public Motorista[] getArrayMotoristas() {
        return arrayMotoristas;
    }

    public void setArrayMotoristas(Motorista[] arrayMotoristas) {
        this.arrayMotoristas = arrayMotoristas;
    }

    @Override
    public String toString() {
        return "EmpresaTransporte{" +
                "nome='" + nome + '\'' +
                ", numCNPJ='" + numCNPJ + '\'' +
                ", faturamentoBruto=" + faturamentoBruto +
                ", faturamentoLiquido=" + faturamentoLiquido +
                ", qtdMotoristas=" + arrayMotoristas.length +
                '}';
    }
}


