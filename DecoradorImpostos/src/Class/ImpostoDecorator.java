package Class;

public class ImpostoDecorator implements Iimposto {

	public Iimposto imposto;
	
	public ImpostoDecorator(Iimposto imposto) {
		this.imposto = imposto;
	}
	
	@Override
	public double valorOriginal() {
		return imposto.valorOriginal();
	}

	@Override
	public double calcularImposto() {
		return imposto.calcularImposto();
	}

	@Override
	public double Imposto() {
		return imposto.Imposto();
	}

	
	
	
}
