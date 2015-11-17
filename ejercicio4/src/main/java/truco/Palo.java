package truco;

public abstract class Palo {

	private int cartasLeidas = 0;
	private int envidoAcumulado = 0;
	private int primerMayorAporte = 0;
	private int segundoMayorAporte = 0;
	
	public int acumularEnvido(int aporteAEnvido) {
		
		this.cartasLeidas++;
		this.evaluarAportes (aporteAEnvido);		
		
		if (this.cartasLeidas < 2){
			this.envidoAcumulado = aporteAEnvido;
		}else{
			this.envidoAcumulado = 20 + this.primerMayorAporte + this.segundoMayorAporte;
		}
			
		return this.envidoAcumulado;
	}	
	
	
	private void evaluarAportes(int aporteAEnvido) {
		
		if (this.primerMayorAporte < aporteAEnvido){
			this.segundoMayorAporte = this.primerMayorAporte;
			this.primerMayorAporte = aporteAEnvido;
		}else if (this.segundoMayorAporte < aporteAEnvido){
			this.segundoMayorAporte = aporteAEnvido;
		}
	}
}