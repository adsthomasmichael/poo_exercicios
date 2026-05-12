package clinicaVeterinaria;

public class Data {

    protected int dia;
    protected int mes;
    protected int ano;

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia > 0 && dia < 32){
            this.dia = dia;
        }

    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes > 0 && mes < 13){
            this.mes = mes;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 0){
            this.ano = ano;
        }
    }

    public void imprimeData(){
        System.out.println("=== DATA ===");
        System.out.printf("Data: %d/%d/%d", dia, mes, ano);
    }
}
