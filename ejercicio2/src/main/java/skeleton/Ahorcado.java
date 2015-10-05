package skeleton;

public class Ahorcado {
	
	private int vidas = 7;;
	private String estado;
	private ReglaDeAhorcado regla;
	
	public Ahorcado(String palabra) {
		
		this.estado = null;
		this.regla = new ReglaDeAhorcado (palabra);
	}
	
	public Ahorcado (){
	
	}

	public void arriesgar(String letra) {
		this.estado = this.regla.aplicarAPalabra(letra);
		
	}

	public String estado() {
		
		return this.estado;
	}

	public int vidas() {
		
		return this.vidas;
	}
}