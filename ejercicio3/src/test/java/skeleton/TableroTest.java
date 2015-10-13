package skeleton;

import org.junit.Assert;
import org.junit.Test;

public class TableroTest {

	@Test
	public void agregarDebeDevolverTrueSiAgregaBarco() {

		Tablero tablero = new Tablero();

		boolean agregado = tablero.agregar(new Destructor(), 0, 0, new Vertical());
		Assert.assertTrue(agregado);
	}

	@Test
	public void agregarNoDebeAgregarBarcoSiPosicionIngresadaEstaOcupada() {

		Tablero tablero = new Tablero();
		tablero.agregar(new Destructor(), 0, 2, new Horizontal());

		boolean agregado = tablero.agregar(new Destructor(), 0, 2, new Horizontal());

		Assert.assertFalse(agregado);
	}

	@Test
	public void agregarNoDebeAgregarBarcoSiPosicionIngresadaEstaMuyCercanaAOcupada() {

		Tablero tablero = new Tablero();
		tablero.agregar(new Destructor(), 0, 2, new Horizontal());

		boolean agregado = tablero.agregar(new Destructor(), 0, 0, new Horizontal());

		Assert.assertFalse(agregado);
	}

	@Test
	public void agregarNoDebeAgregarBarcoVerticalmenteSiPosicionIngresadaEstaMuyCercanaAOcupada() {

		Tablero tablero = new Tablero();
		tablero.agregar(new Destructor(), 2, 0, new Vertical());

		boolean agregado = tablero.agregar(new Destructor(), 0, 0, new Vertical());

		Assert.assertFalse(agregado);
	}

	@Test
	public void entraEnZonaValidaDebeDevolverSiUnBarcoEntraEnTablero() {

		Tablero tablero = new Tablero();
		int fila = 9;
		int columna = 0;
		boolean entra = tablero.entraEnZonaValida(new Destructor(), fila, columna, new Vertical());
		Assert.assertFalse(entra);

		entra = tablero.entraEnZonaValida(new Destructor(), fila, columna, new Horizontal());
		Assert.assertTrue(entra);
	}

	@Test
	public void buscarBlancoEnDebeDevolverTocoAguaSiNoHayBarco() {

		Tablero tablero = new Tablero();
		int fila = 0;
		int columna = 0;
		tablero.agregar(new Destructor(), fila, columna, new Horizontal());

		int filaObjetivo = 1;
		int columnaObjetivo = 1;
		String mensajePostDisparo = tablero.buscarBlancoEn(filaObjetivo, columnaObjetivo);
		Assert.assertEquals("toco agua", mensajePostDisparo);
	}

	@Test
	public void buscarBlancoEnDebeDevolverAveriadoSiGolpeaBarco() {

		Tablero tablero = new Tablero();
		int fila = 0;
		int columna = 0;
		tablero.agregar(new Destructor(), fila, columna, new Horizontal());

		String mensajePostDisparo = tablero.buscarBlancoEn(fila, columna);
		Assert.assertEquals("barco averiado", mensajePostDisparo);
	}

	@Test
	public void buscarBlancoEnDebeDevolverHundidoSiAcaboConElBarco() {

		Tablero tablero = new Tablero();
		int fila = 0;
		int columna = 0;
		tablero.agregar(new Destructor(), fila, columna, new Horizontal());

		assertearHundimiento(tablero, fila, columna);
	}

	@Test
	public void buscarBlancoEnDebeDevolverHundidoYAveriadoSiHundioSoloUnoYDanioOtro() {

		Tablero tablero = new Tablero();
		int fila = 0;
		int columna = 0;
		int filaDos = 1;
		int columnaDos = 0;

		tablero.agregar(new Destructor(), fila, columna, new Horizontal());
		tablero.agregar(new Destructor(), filaDos, columnaDos, new Vertical());

		assertearHundimiento(tablero, fila, columna);
		Assert.assertEquals("toco agua", tablero.buscarBlancoEn(fila, columna + 1));
		Assert.assertEquals("barco averiado", tablero.buscarBlancoEn(filaDos, columnaDos));
	}

	private void assertearHundimiento(Tablero tablero, int fila, int columna) {
		tablero.buscarBlancoEn(fila, columna + 2);
		tablero.buscarBlancoEn(fila, columna);
		String mensajePostDisparo = tablero.buscarBlancoEn(fila, columna + 1);
		Assert.assertEquals("barco hundido", mensajePostDisparo);
	}

}