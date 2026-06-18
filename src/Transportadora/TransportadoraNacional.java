package Transportadora;


public class TransportadoraNacional extends EmpresaTransporte{

    protected String registroANTT;

    public TransportadoraNacional(String nome, String numCNPJ, double faturamentoBruto, double faturamentoLiquido, int qntMotoristas, String registroANTT) {
        super(nome, numCNPJ, faturamentoBruto, faturamentoLiquido, qntMotoristas);
        this.registroANTT = registroANTT;
    }

    public String getRegistroANTT() {
        return registroANTT;
    }

    public void setRegistroANTT(String registroANTT) {
        this.registroANTT = registroANTT;
    }

    @Override
    public String toString() {
        return "TransportadoraNacional{" +
                "registroANTT='" + registroANTT + '\'' +
                ", nome='" + nome + '\'' +
                ", numCNPJ='" + numCNPJ + '\'' +
                ", faturamentoBruto=" + faturamentoBruto +
                ", faturamentoLiquido=" + faturamentoLiquido +
                ", qtdMotoristas=" + arrayMotoristas.length +
                '}';
    }
}
