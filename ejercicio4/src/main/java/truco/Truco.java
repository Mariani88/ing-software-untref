package truco;

import java.util.Iterator;
import java.util.List;

public class Truco {

	public int obtenerEnvidoDe(List<Carta> cartas) {
		
		int envido = 0;
		Iterator<Carta> iterador = cartas.iterator();
		
		while (iterador.hasNext()){		
			envido = iterador.next().contribuirAlEnvido();
		}
		
		return envido;
	}
}
