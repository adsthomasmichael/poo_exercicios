package sistemaDelivery;

public class Cliente {
	
	private String nome;
	private String endereco;
	private boolean vip;

public Cliente(String nome, String endereco) {

	setNome(nome);
	setEndereco(endereco);
	this.vip = false;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	if( nome != null && !nome.trim().isEmpty() ) { //validação nome nulo ou vazio
		this.nome = nome;
	}
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	if (endereco != null && !endereco.trim().isEmpty()) { //validação endereco nulo ou vazio
		this.endereco = endereco;
	}
}

public boolean isVip() {
	return vip;
}

public void setVip(boolean vip) {
	this.vip = vip;
}

public void exibirInformacoes() {
	System.out.println("=== Cliente ===\n");
	System.out.println("Nome    : "+ nome);
	System.out.println("Endereço: "+ endereco);
	System.out.println("VIP     : "+ (vip ? "Sim" : "Não")); //operador ternário:(condição) ? valor_se_true : valor_se_false
}

@Override
public String toString() {
	return nome + " - " + endereco + " (VIP: " + (vip ? "Sim" : "Não") + ")";
}


}
