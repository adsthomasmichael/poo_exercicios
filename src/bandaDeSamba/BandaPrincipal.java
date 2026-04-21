package bandaDeSamba;

import com.utils.*;

public class BandaPrincipal {

	public static void main(String[] args) {
		
		//Instanciando novo objeto Cavaquinista:
		
		Cavaquinista cav01 = new Cavaquinista("Michael Thomas", 42, 27, 7.3);
		cav01.setEstiloLevada("Partido Alto");
		
		Cavaquinista cav02 = new Cavaquinista("Waguinho", 39, 24, 8.4);
		cav02.setEstiloLevada("Pagodinho");
		
		Cavaquinista cav03 = new Cavaquinista("Thiago Ribeiro", 40, 24, 7.2);
		cav03.setEstiloLevada("Samba e Pagode");
		
		Cavaquinista cav04 = new Cavaquinista(null, 0, 0, 0);
		
		//Chamando o metodo Status:
		cav01.statusCavaquinista();
		cav02.statusCavaquinista();
		cav03.statusCavaquinista();
		
		
		
	}

}
