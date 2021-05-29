package Class;

public class ImpostoB extends ImpostoDecorator {

	public ImpostoB(Iimposto imposto) {
		super(imposto);
		// TODO Auto-generated constructor stub
	}
	
	public double valorOriginal() {
		return super.valorOriginal();
	}
	
	public double Imposto() {
		return 0.50;
	}
	
	public double calcularImposto() {
		return valorOriginal() - super.calcularImposto();
	}

}
