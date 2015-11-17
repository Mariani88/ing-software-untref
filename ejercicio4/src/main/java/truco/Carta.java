package truco;

public class Carta {

	private int aporteAEnvido;
	private Palo paloDeCarta;
	
	public Carta(int numero, Palo palo) {
		
		this.aporteAEnvido = numero;
		this.paloDeCarta = palo;
	}

	public int getAporteAEnvido() {
		
		return this.aporteAEnvido;
	}



}
