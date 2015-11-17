package truco;

public class Carta {

	private int aporteAEnvido = 0;
	private Palo paloDeCarta;
	
	public Carta(int numero, Palo palo) {
		
		if (numero < 10){
			this.aporteAEnvido = numero;
		}
		
		this.paloDeCarta = palo;
	}

	public int getAporteAEnvido() {
		
		return this.aporteAEnvido;
	}

	public int contribuirAlEnvido() {
		
		return this.paloDeCarta.acumularEnvido(this.aporteAEnvido);
	}
}