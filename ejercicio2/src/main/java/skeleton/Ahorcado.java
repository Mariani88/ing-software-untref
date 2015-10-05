package skeleton;

public class Ahorcado {
	
	private int vidas = 7;;
	private String estado;
	private ReglaDeAhorcado regla;
	
	public Ahorcado(String palabra) {
		
		this.regla = new ReglaDeAhorcado (palabra);
		this.estado = this.regla.getEstado();
	}
	
	public Ahorcado (){
	
	}

	public void arriesgar(String letra) {
		
		String viejoEstado = new String (this.estado);
		this.estado = this.regla.aplicarAPalabra(letra);
		
		if ( this.estado.equals( viejoEstado )){
			this.vidas--;
		}
	}

	public String estado() {
		
		return this.estado;
	}

	public int vidas() {
		
		return this.vidas;
	}
}