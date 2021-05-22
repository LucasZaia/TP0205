package Singleton;

public class Singleton {
	
	private static Singleton instance;
	private String texto;
	
	

	private Singleton() {}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public String getTexto() {
		return texto;
	}

	public static Singleton getInstance() {
		if(instance == null ) {
			instance = new Singleton();
		}
	   return instance;
	}
}
