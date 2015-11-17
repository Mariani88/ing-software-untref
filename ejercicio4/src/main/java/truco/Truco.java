package truco;

import java.util.Iterator;
import java.util.List;

public class Truco {

	public int obtenerEnvidoDe(List<Carta> cartas) {

		int envido = 0;
		int envidoDePalo = 0;
		Iterator<Carta> iterador = cartas.iterator();

		while (iterador.hasNext()) {
			envidoDePalo = iterador.next().contribuirAlEnvido();			
			envido = evaluarEnvidos (envido, envidoDePalo);
		}

		return envido;
	}

	private int evaluarEnvidos(int envido, int envidoDePalo) {
		
		if (envido < envidoDePalo){
			envido = envidoDePalo;
		}
		
		return envido;
	}
}