package Class;

public class BolaDecorator implements Bola{
	
	public Bola bola;

	
	public BolaDecorator(Bola bola) {
		this.bola = bola;
	}
	
	public String acao() {
		return bola.acao();
	}

	
	
	
	
}
