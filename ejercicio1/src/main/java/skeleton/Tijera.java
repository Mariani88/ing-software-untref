package skeleton;

public class Tijera extends Opcion{
	
	public boolean equals(Object obj) {

		boolean iguales = this == obj;

		if (!iguales && obj != null && obj instanceof Tijera) {
			iguales = true;
		}

		return iguales;
	}

	@Override
	public boolean leGanaA(Opcion opcion) {
		
		return opcion.equals(new Papel ());
	}
}
