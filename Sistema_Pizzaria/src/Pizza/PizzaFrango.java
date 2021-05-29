package Pizza;

import java.util.ArrayList;
import java.util.List;

import Ingrediente.Iingrediente;

public class PizzaFrango implements IPizza{
	private double valor; 
	private List<Iingrediente> ingredientes = new ArrayList<Iingrediente>();
	public static PizzaFrango Build() {
		return new PizzaFrango();
	}
	
	
	private PizzaFrango(){
		
	}
	
	public String getTipo() {
		return "Pizza de Calabresa";
	}
	
	public double getValor() {
		return valor;
	}
	
	public PizzaFrango setValor(double valor) {
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
