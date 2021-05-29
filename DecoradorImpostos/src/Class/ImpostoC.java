package Class;

public class ImpostoC extends ImpostoDecorator {

	public ImpostoC(Iimposto imposto) {
		super(imposto);
		// TODO Auto-generated constructor stub
	}
	
	public double valorOriginal() {
		return super.valorOriginal();
	}
	
	public double Imposto() {
		return 0.20;
	}
	
	public double calcularImposto() {
		return super.calcularImposto() * 0.20;
	}

}
