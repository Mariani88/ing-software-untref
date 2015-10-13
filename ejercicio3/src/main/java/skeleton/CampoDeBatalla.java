package skeleton;

public class CampoDeBatalla {

	public void construirLugarDeCombate(Barco[][] matrizTablero) {

		for (int i = 0; i < matrizTablero.length; i++) {
			for (int j = 0; j < matrizTablero[i].length; j++) {
				matrizTablero[i][j] = null;
			}
		}
	}
}