package Class;

public class ImpostoA extends ImpostoDecorator {

	public ImpostoA(Iimposto imposto) {
		super(imposto);
	}
	
	public double valorOriginal() {
		return super.valorOriginal();
	}
	
	public double Imposto() {
		return 0.30;
	}
	
	public double calcularImposto() {
		return super.calcularImposto() * Imposto();
	}
	
}
