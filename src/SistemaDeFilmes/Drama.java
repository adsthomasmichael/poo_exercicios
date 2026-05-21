package SistemaDeFilmes;

public class Drama extends Filme{

	protected boolean ganhouOscar;

	public Drama() {
		super();
		
	}

	public Drama(String titulo, String diretor, double duracao, int ano, boolean ganhouOscar) {
		super(titulo, diretor, duracao, ano);
		this.ganhouOscar = ganhouOscar;
	}

	public boolean isGanhouOscar() {
		return ganhouOscar;
	}

	public void setGanhouOscar(boolean ganhouOscar) {
		this.ganhouOscar = ganhouOscar;
	}

	@Override
	public String toString() {
		return super.toString() + ", Drama [ganhouOscar=" + ganhouOscar + "]";
	}
	
	
	
	
}
