package truco;

public abstract class Palo {

	private int cartasLeidas = 0;
	private int envidoAcumulado = 0;
	
	public int acumularEnvido(int aporteAEnvido) {
		
		this.cartasLeidas++;
		this.envidoAcumulado += aporteAEnvido;
		
		if (this.cartasLeidas == 2 ){
			this.envidoAcumulado +=20;
		}
		
		return this.envidoAcumulado;
	}

	
	
}
