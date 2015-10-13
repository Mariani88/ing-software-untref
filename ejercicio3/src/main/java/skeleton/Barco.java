package skeleton;

public abstract class Barco {

	protected int tamanio;
	protected int vida;
	
	public int getTamanio() {
		return this.tamanio;
	}
	
	public void reducirVida (){
		this.vida--;
	}
	
	public int getVida (){
		return this.vida;
	}
}