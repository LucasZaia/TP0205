package Class;

public class BolaPingar extends BolaDecorator {

	public BolaPingar(Bola bola) {
		super(bola);
	}
	
	public String Pingar() {
		return "PINGANDO...";
	}
	
	public String acao() {
		return super.acao()+ Pingar();
	}

}
