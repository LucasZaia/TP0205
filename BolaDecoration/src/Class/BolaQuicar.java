package Class;

public class BolaQuicar extends BolaDecorator {

	public BolaQuicar(Bola bola) {
		super(bola);
	}
	
	public String Quicar() {
		return "QUICANDO...";
	}
	
	public String acao() {
		return super.acao()+ Quicar();
	}

}