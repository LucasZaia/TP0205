package Pizza;

import java.util.List;

import Ingrediente.Iingrediente;

public interface IPizza {
	public String getTipo();
	public double getValor();
	public IPizza setValor(double valor);
	public IPizza AddIngredientes(Iingrediente ingrendiente);
	public Iingrediente fillIngredient(int serial);
	public List<Iingrediente> getIngredientes();
}
