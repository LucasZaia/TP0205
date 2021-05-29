package Class;

public class ImpostoD extends ImpostoDecorator {

	public ImpostoD(Iimposto imposto) {
		super(imposto);
		// TODO Auto-generated constructor stub
	}
	
	public double valorOriginal() {
		return super.valorOriginal();
	}
	
	public double Imposto() {
		return 0.40;
	}
	
	public double calcularImposto() {
		return super.calcularImposto() - (super.calcularImposto() * super.Imposto());
	}


}
