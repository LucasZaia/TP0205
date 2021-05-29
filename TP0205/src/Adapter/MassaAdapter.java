package Adapter;


public class MassaAdapter implements IMassaAdapter {
	
	private IMassa materia;

	public MassaAdapter(IMassa materia) {
		this.materia = materia;
	}

	@Override
	public double calculaConstante() {
		return materia.calculaConstante() * 9.807;
	}
	
	
}
