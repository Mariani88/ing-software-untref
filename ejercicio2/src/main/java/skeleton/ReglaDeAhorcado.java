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
}
