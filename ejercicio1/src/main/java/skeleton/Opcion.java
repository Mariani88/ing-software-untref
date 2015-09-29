package skeleton;

public abstract class Opcion {

	protected Opcion pierde;
	protected Opcion gana;
	
	
	public abstract boolean leGanaA(Opcion opcion);
}