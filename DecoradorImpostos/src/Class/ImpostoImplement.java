package Class;

public class ImpostoImplement implements Iimposto{
	
	public ImpostoImplement() {}
	
	@Override
	public double valorOriginal() {
		return 1200.00;
	}

	@Override
	public double calcularImposto() {
		return valorOriginal();
	}

	@Override
	public double Imposto() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
