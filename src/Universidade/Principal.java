package Universidade;

public class Principal {
    public static void main(String[] args) {


        Faculdade[] faculdades = {
                new FaculdadePublica("Faculdade01", "Porto Alegre", 150000, 140000, (int) (Math.random() * 40 + 1), 1313),
                new FaculdadePublica("Faculdade02", "São Leopoldo", 150000, 140000, (int) (Math.random() * 40 + 1), 1414),
                new FaculdadePublica("Faculdade03", "Canoas", 150000, 140000, (int) (Math.random() * 40 + 1), 1515),
                new FaculdadePublica("Faculdade04", "Guaiba", 150000, 140000, (int) (Math.random() * 40 + 1), 1616),
                new FaculdadePublica("Faculdade05", "Porto Alegre", 150000, 140000, (int) (Math.random() * 40 + 1), 1616),

                new FaculdadePrivada("Faculdade06", "Porto Alegre", 250000, 200000, (int) (Math.random() * 40 + 1), "Grupo Lassale"),
                new FaculdadePrivada("Faculdade07", "Porto Alegre", 350000, 200000, (int) (Math.random() * 40 + 1), "Grupo Umbanda"),
                new FaculdadePrivada("Faculdade08", "Canoas", 250000, 200000, (int) (Math.random() * 40 + 1), "Grupo Lassale"),
                new FaculdadePrivada("Faculdade09", "Canoas", 100000, 75000, (int) (Math.random() * 40 + 1), "Grupo Umbanda"),
                new FaculdadePrivada("Faculdade10", "São Leopoldo", 200000, 175000, (int) (Math.random() * 40 + 1), "Grupo Lassale")
        };

        for (int i = 0; i < faculdades.length; i++) {
            if (faculdades[i] != null) {
                Professor[] professors = faculdades[i].getArrayProfessores();

                for (int j = 0; j < professors.length; j++) {
                    double salarioBruto = Math.random() * 10000 + 2000;
                    double salarioLiquido = salarioBruto * (Math.random() * 0.20 + 0.40);

                    professors[j] = new Professor("Professor " + j, salarioBruto, salarioLiquido);
                }
            }
        }

        AuditoriaFaculdades auditoriaFaculdades = new AuditoriaFaculdades(faculdades);
        //-------MUITOS PROFESSORES----------
        System.out.println("=== Faculdades com Professores demais ===");
        Faculdade[] faculProfessoresDemais = auditoriaFaculdades.universidadesComMuitosProfessores();
        for (int i = 0; i < faculdades.length; i++) {
            if (faculProfessoresDemais[i] instanceof FaculdadePublica) {
                System.out.printf("A Faculdade %S é pública e seu codigo no MEC é %d. \n", faculProfessoresDemais[i].getNome(), ((FaculdadePublica) faculProfessoresDemais[i]).getCodMEC());
            } else if (faculProfessoresDemais[i] instanceof FaculdadePrivada) {
                System.out.printf("A Faculdade %S é Privada e faz parte do grupo empresarial %S. \n", faculProfessoresDemais[i].getNome(), ((FaculdadePrivada) faculProfessoresDemais[i]).getGrupoEmpresarial());
            }
        }

        //-------------DESCONTOS SALARIAIS-------------
        System.out.println("=== Faculdades com descontos salariais ===");
        Faculdade[] faculDescontosSalariais = auditoriaFaculdades.universidadesComDescontoSalarial();

        for (int i = 0; i < faculdades.length; i++){
            if (faculDescontosSalariais[i] instanceof FaculdadePublica) {
                System.out.printf("A Faculdade %S é pública e seu codigo no MEC é %d. \n", faculDescontosSalariais[i].getNome(), ((FaculdadePublica) faculDescontosSalariais[i]).getCodMEC());
            } else if (faculDescontosSalariais[i] instanceof FaculdadePrivada) {
                System.out.printf("A Faculdade %S é Privada e faz parte do grupo empresarial %S. \n", faculDescontosSalariais[i].getNome(), ((FaculdadePrivada) faculDescontosSalariais[i]).getGrupoEmpresarial());
            }
        }

        //-------------DESCONTOS DESVIOS ORÇAMENTARIOS-------------
        System.out.println("=== Faculdades com desvios orçamentarios ===");
        Faculdade[] faculDesvios = auditoriaFaculdades.universidadesComDesvioOrcamentario();

        for (int i = 0; i < faculDesvios.length; i++){
            if (faculDesvios[i] instanceof FaculdadePublica){
                System.out.printf("A Faculdade %S é pública e seu codigo no MEC é %d. \n", faculDesvios[i].getNome(), ((FaculdadePublica) faculDesvios[i]).getCodMEC());
            } else if (faculDesvios[i] instanceof FaculdadePrivada) {
                System.out.printf("A Faculdade %S é Privada e faz parte do grupo empresarial %S. \n", faculDesvios[i].getNome(), ((FaculdadePrivada) faculDesvios[i]).getGrupoEmpresarial());
            }
        }
    }
}




