package Transportadora;

public class PrincipalTransportes {
    public static void main(String[] args) {

    EmpresaTransporte[] empresas = {
            new TransportadoraNacional("Transporte N1", "CNPJ0001",100000, 80000,(int)(Math.random() * 50 +1),"ANTT01"),
            new TransportadoraNacional("Transporte N2", "CNPJ0002",100000, 70000,(int)(Math.random() * 50 +1),"ANTT01"),
            new TransportadoraNacional("Transporte N3", "CNPJ0003",100000, 90000,(int)(Math.random() * 50 +1),"ANTT01"),
            new TransportadoraNacional("Transporte N4", "CNPJ0004",100000, 50000,(int)(Math.random() * 50 +1),"ANTT01"),
            new TransportadoraNacional("Transporte N5", "CNPJ0005",100000, 100000,(int)(Math.random() * 50 +1),"ANTT01"),

            new TransportadoraInternacional("Transporte IN6","CNPJ0006", 100000, 90000,(int)(Math.random()* 50 + 1),"BRA"),
            new TransportadoraInternacional("Transporte IN7","CNPJ0007", 100000, 100000,(int)(Math.random()* 50 + 1),"USA"),
            new TransportadoraInternacional("Transporte IN8","CNPJ0008", 100000, 80000,(int)(Math.random()* 50 + 1),"ARG"),
            new TransportadoraInternacional("Transporte IN9","CNPJ0009", 100000, 78000,(int)(Math.random()* 50 + 1),"CAN"),
            new TransportadoraInternacional("Transporte IN10","CNPJ00010", 200000, 175000,(int)(Math.random()* 50 + 1),"BRA")
    };


    for (int i = 0; i < empresas.length; i++){
        if (empresas[i] != null){
            Motorista[] motoristas  = empresas[i].getArrayMotoristas();

            for (int j = 0; j < motoristas.length; j++){
                double salarioBruto = Math.random()* 10000 + 2000;
                double salarioLiq = salarioBruto * (Math.random()*0.50 + 0.50);

                motoristas[j] = new Motorista("Motorista"+ j, salarioBruto,salarioLiq);
            }
        }

    }

    AuditoriaTransportes auditoria = new AuditoriaTransportes(empresas);

    //EMPRESAS COM MUITOS MOTORISTAS
        System.out.println("=== Empresas com qtd de motoristas acima do permitido ===");
        EmpresaTransporte[] empresasMuitosMotoras = auditoria.empresasComMuitosMotoristas();

        for (int i = 0; i < empresasMuitosMotoras.length; i++){
            if (empresasMuitosMotoras[i] != null){
                if (empresasMuitosMotoras[i] instanceof TransportadoraNacional){
                    System.out.printf("Transportadora Nacional %s - Registro %s \n", empresasMuitosMotoras[i].getNome(), ((TransportadoraNacional) empresasMuitosMotoras[i]).getRegistroANTT());
                } else if (empresasMuitosMotoras[i]instanceof TransportadoraInternacional) {
                    System.out.printf("Transportadora Internacional %s - País %s \n", empresasMuitosMotoras[i].getNome(), ((TransportadoraInternacional) empresasMuitosMotoras[i]).getPaisOrigem());
                }
            }
        }

    //EMPRESAS
    }




}