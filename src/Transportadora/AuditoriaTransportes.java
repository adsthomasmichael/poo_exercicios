package Transportadora;

public class AuditoriaTransportes {
    protected EmpresaTransporte[] arrayTransportadoras;

    public AuditoriaTransportes(EmpresaTransporte[] arrayTransportadoras) {
        this.arrayTransportadoras = arrayTransportadoras;
    }

    public EmpresaTransporte[] getArrayTransportadoras() {
        return arrayTransportadoras;
    }

    public void setArrayTransportadoras(EmpresaTransporte[] arrayTransportadoras) {
        this.arrayTransportadoras = arrayTransportadoras;
    }


    public EmpresaTransporte[] empresasComMuitosMotoristas() { //Retorna um array contendo as empresas com mais de 30 motoristas

        EmpresaTransporte[] arrayRetorno = new EmpresaTransporte[arrayTransportadoras.length];

        for (int i = 0; i < arrayTransportadoras.length; i++){
            if (arrayTransportadoras[i] != null) {
                if (arrayTransportadoras[i].getArrayMotoristas().length > 30) {
                    arrayRetorno[i] = arrayTransportadoras[i];
                }
            }
        }
        return arrayRetorno;
    }

    public EmpresaTransporte[] empresasComDescontoSalarial(){ //Retorna um array contendo as empresas que possuem pelo menos um motorista cujo salário líquido é menor que 75% do bruto

        EmpresaTransporte[] arrayRetorno = new EmpresaTransporte[arrayTransportadoras.length];

        for (int i = 0; i < arrayTransportadoras.length; i++){
            if (arrayTransportadoras[i] != null){
                Motorista[] motoristas = arrayTransportadoras[i].getArrayMotoristas();

                for (int j = 0; j < motoristas.length; j++){
                    double salarioLiqOK = motoristas[j].getSalarioBruto() * 0.75;

                    if (motoristas[j].getSalarioLiquido() < salarioLiqOK){
                        arrayRetorno[i] = arrayTransportadoras[i];
                        break;
                    }
                }
            }
        }
        return arrayRetorno;
    }

    public EmpresaTransporte[] empresasComSuspeitaFiscal(){ //Retorna um array contendo as empresas cujo faturamento líquido é maior que 92% do faturamento bruto

        EmpresaTransporte[] arrayRetorno = new EmpresaTransporte[arrayTransportadoras.length];

        for (int i = 0; i < arrayTransportadoras.length; i++){
            if (arrayTransportadoras[i] != null){
                double fatLiqOK = arrayTransportadoras[i].getFaturamentoBruto() * 0.92;

                if (arrayTransportadoras[i].getFaturamentoLiquido() > fatLiqOK){
                    arrayRetorno[i] = arrayTransportadoras[i];
                }
            }
        }
        return arrayRetorno;
    }

    public EmpresaTransporte empresaComMaisMotoristas(){ //Retorna a empresa que possui o maior número de motoristas.
        EmpresaTransporte empresaMaisFunc = null;
        int maisFunc = 0;

        for (int i = 0; i < arrayTransportadoras.length; i++){
            if (arrayTransportadoras[i] != null){

                if (arrayTransportadoras[i].getArrayMotoristas().length > maisFunc){
                    maisFunc = arrayTransportadoras[i].getArrayMotoristas().length;
                    empresaMaisFunc = arrayTransportadoras[i];
                }
            }
        }
        return empresaMaisFunc;
    }


}