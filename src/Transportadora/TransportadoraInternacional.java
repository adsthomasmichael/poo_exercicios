package Transportadora;


public class TransportadoraInternacional extends EmpresaTransporte {
    protected String paisOrigem;

    public TransportadoraInternacional(String nome, String numCNPJ, double faturamentoBruto, double faturamentoLiquido, int qntMotoristas, String paisOrigem) {
        super(nome, numCNPJ, faturamentoBruto, faturamentoLiquido, qntMotoristas);
        this.paisOrigem = paisOrigem;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    @Override
    public String toString() {
        return "TransportadoraInternacional{" +
                "paisOrigem='" + paisOrigem + '\'' +
                ", nome='" + nome + '\'' +
                ", numCNPJ='" + numCNPJ + '\'' +
                ", faturamentoBruto=" + faturamentoBruto +
                ", faturamentoLiquido=" + faturamentoLiquido +
                ", qtdMotoristas=" + arrayMotoristas.length +
                '}';
    }
}
