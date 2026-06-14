package Universidade;

public class AuditoriaFaculdades {

    protected Faculdade[] arrayFaculdades;

    public AuditoriaFaculdades(Faculdade[] arrayFaculdades) {
        this.arrayFaculdades = arrayFaculdades;
    }

    public Faculdade[] getArrayFaculdades() {
        return arrayFaculdades;
    }

    public void setArrayFaculdades(Faculdade[] arrayFaculdades) {
        this.arrayFaculdades = arrayFaculdades;
    }

    //Retorna um array contendo apenas as universidades que possuem mais de 25 professores.
    public Faculdade[] universidadesComMuitosProfessores(){

        Faculdade[] arrayRetorno = new Faculdade[arrayFaculdades.length];

        for (int i = 0; i < arrayFaculdades.length; i++){
            if (arrayFaculdades[i].getArrayProfessores().length > 25){
                arrayRetorno[i] = arrayFaculdades[i];
            }
        }
        return arrayRetorno;
    }

    //Retorna um array contendo as universidades que possuem pelo menos um professor cujo salário líquido é menor que 80% do salário bruto.
    public Faculdade[] universidadesComDescontoSalarial(){

        Faculdade[] arrayRetoruno = new Faculdade[arrayFaculdades.length];

        for (int i = 0; i < arrayFaculdades.length; i++){
            Professor[] arrayDeProf = arrayFaculdades[i].getArrayProfessores();
            double salLiqOk = arrayDeProf[i].getSalarioBruto() * 0.80;

            if (arrayDeProf[i].getSalarioLiquido() < salLiqOk){
                arrayRetoruno[i] = arrayFaculdades[i];
            }

        }
        return arrayRetoruno;
    }

    //Retorna um array contendo as universidades cujo orçamento líquido é maior que 90% do orçamento bruto.
    public Faculdade[] universidadesComDesvioOrcamentario(){

        Faculdade[] arrayRetorno = new Faculdade[arrayFaculdades.length];

        for ( int i = 0; i < arrayFaculdades.length; i++){
            double orcaOK = arrayFaculdades[i].getOrcamentoBruto() * 90;
            if (arrayFaculdades[i].getOrcamentoLiquido() > orcaOK){
                arrayRetorno[i] = arrayFaculdades[i];
            }
        }
        return arrayRetorno;
    }


}
