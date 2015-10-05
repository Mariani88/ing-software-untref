package skeleton;

public class ReglaDeAhorcado {

	private String palabra;
	private String estadoDeAhorcado;

	
	public ReglaDeAhorcado ( String palabra){
		this.palabra = palabra;
		this.estadoDeAhorcado = "";
	
		
		for (int i = 0; i < palabra.length(); i++){
			this.estadoDeAhorcado = this.estadoDeAhorcado + "*";
		}
	}

	public String aplicarAPalabra(String letra) {
		
		letra = letra.toLowerCase();
		int ultimaDeteccion = 0;
		boolean terminado = false;
		int inicioDeBusqueda = 0;
		
		while (!terminado) {
			
			ultimaDeteccion = this.palabra.indexOf(letra, inicioDeBusqueda);
			inicioDeBusqueda = modificarInicioDeBusqueda(letra, ultimaDeteccion, inicioDeBusqueda);
			terminado = (ultimaDeteccion == -1);
		}
		
		return this.estadoDeAhorcado;
	}

	private int modificarInicioDeBusqueda(String letra, int ultimaDeteccion, int inicioDeBusqueda) {
	
		if (ultimaDeteccion != -1) {
			this.estadoDeAhorcado = this.estadoDeAhorcado.substring(0, ultimaDeteccion) + letra
					+ this.estadoDeAhorcado.substring(ultimaDeteccion + 1);
			inicioDeBusqueda = ultimaDeteccion + 1;
		}
		
		return inicioDeBusqueda;
	}
	
	public String getEstado (){
		return this.estadoDeAhorcado;
	}

	public String obtenerCondicionDelJugador(int vidas) {
		
		if (vidas > 0 && this.palabra.equals(this.estadoDeAhorcado)){
			return "ganaste";
		}else if (vidas == 0){
			return "ahorcado"; 
		}else {
			return String.valueOf(vidas);
		}
	}

	public void setEstadoJugador(String estado) {
		this.estadoDeAhorcado = estado;
		
	}
}
