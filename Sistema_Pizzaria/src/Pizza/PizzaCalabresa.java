package Pizza;

import java.util.List;
import java.util.ArrayList;

import Ingrediente.Iingrediente;


public class PizzaCalabresa implements IPizza {
	private double valor; 
	private List<Iingrediente> ingredientes = new ArrayList<Iingrediente>();
	public static PizzaCalabresa Build() {
		return new PizzaCalabresa();
	}
	
	
	private PizzaCalabresa() {
		
	}
	
	public String getTipo() {
		return "Pizza de Calabresa";
	}
	
	public double getValor() {
		return valor;
	}
	
	public PizzaCalabresa setValor(double valor) {
		this.valor = valor;
		return this;
	}
	
	public IPizza AddIngredientes(Iingrediente ingrediente) {
		ingredientes.add(ingrediente);
		return this;
	}
	
	public Iingrediente fillIngredient(int serial) {
		return ingredientes.get(serial);
	}
	
	public List<Iingrediente> getIngredientes(){
		return ingredientes;
	}
			
}