package clinicaVeterinaria;

public class Consulta {

    protected String descricao;
    protected Data data;

    public Consulta(String descricao, Data data) {
        setDescricao(descricao);
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao != null && !descricao.trim().isEmpty()){
            this.descricao = descricao;
        }
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void imprimeConsulta(){
        System.out.println("=== CONSULTA ===");
        System.out.println("Descrição: "+ getDescricao());
        data.imprimeData();
    }
}
