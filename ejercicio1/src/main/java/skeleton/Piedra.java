package skeleton;

public class Piedra extends Opcion{

	
	public boolean equals (Object obj){
		
		boolean iguales = this == obj;
		
		if ( !iguales && obj != null && obj instanceof Piedra){
			iguales = true;
		}
		
		return iguales;
	}
}

