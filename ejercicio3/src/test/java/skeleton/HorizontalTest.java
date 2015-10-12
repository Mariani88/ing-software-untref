package skeleton;

import org.junit.Assert;
import org.junit.Test;

public class HorizontalTest {

	private Orientacion horizontal = new Horizontal();
	private Barco[][] matrizTablero = new Barco[4][4];
	private CampoDeBatalla campo = new CampoDeBatalla();

	@Test
	public void ubicarBarcoDebeColocarDestructorEnTableroHorizontalmente() {
		int fila = 0;
		int columna = 0;
		this.campo.construirLugarDeCombate(this.matrizTablero);
		Barco destructor = new Destructor();

		this.horizontal.ubica(destructor, this.matrizTablero, fila, columna);

		Assert.assertEquals(destructor, this.matrizTablero[0][0]);
		Assert.assertEquals(destructor, this.matrizTablero[0][1]);
		Assert.assertEquals(destructor, this.matrizTablero[0][2]);
		this.assertarNullDesde(0, 3);
	}

	@Test
	public void ubicarBarcoDebeColocarAcorazadoEnTableroHorizontalmente() {
		int fila = 0;
		int columna = 0;
		this.campo.construirLugarDeCombate(this.matrizTablero);
		Barco acorazado = new Acorazado();

		this.horizontal.ubica(acorazado, this.matrizTablero, fila, columna);

		Assert.assertEquals(acorazado, this.matrizTablero[0][0]);
		Assert.assertEquals(acorazado, this.matrizTablero[0][1]);
		this.assertarNullDesde(0, 2);
	}

	@Test
	public void ubicarBarcoDebeColocarLanchaEnTableroHorizontalmente() {
		int fila = 0;
		int columna = 0;
		this.campo.construirLugarDeCombate(this.matrizTablero);
		Barco lancha = new Lancha();

		this.horizontal.ubica(lancha, this.matrizTablero, fila, columna);

		Assert.assertEquals(lancha, this.matrizTablero[0][0]);
		this.assertarNullDesde(0, 1);
	}
	
	
	@Test
	public void zonaDisponibleParaDebeDevolverSiLaZonaEstaDisponibleParaUbicarBarco() {

		this.matrizTablero[0][2] = new Lancha();

		boolean zonaDisponible = true;
		zonaDisponible = this.horizontal.zonaDisponiblePara(new Destructor(), this.matrizTablero, 0, 0);
		Assert.assertFalse(zonaDisponible);
	}

	
	@Test
	public void validarZonaDeUbicacionDebeDevolverSiLaZonaPerteneceAlTablero() {

		boolean zonaValida = true;
		int fila = 3;
		int columna = 3;
		zonaValida = this.horizontal.validarZonaDeUbicacionPara(new Destructor(), this.matrizTablero, fila, columna);

		Assert.assertFalse(zonaValida);
	}
	
	
	@Test
	public void validarZonaDeUbicacionDebeDevolverFalseSiFilaInvalida() {

		boolean zonaValida = true;
		int fila = 4;
		int columna = 3;
		zonaValida = this.horizontal.validarZonaDeUbicacionPara(new Destructor(), this.matrizTablero, fila, columna);

		Assert.assertFalse(zonaValida);
	}
	
	
	
	private void assertarNullDesde(int fila, int columna) {

		for (int j = columna; j < this.matrizTablero[fila].length; j++) {
			Assert.assertNull(this.matrizTablero[fila][j]);
		}

		for (int i = fila + 1; i < this.matrizTablero.length; i++) {
			for (int j = 0; j < this.matrizTablero[i].length; j++) {
				Assert.assertNull(this.matrizTablero[i][j]);
			}
		}
	}
}