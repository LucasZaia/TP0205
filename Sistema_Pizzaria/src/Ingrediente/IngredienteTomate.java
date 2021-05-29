package Ingrediente;

public class IngredienteTomate implements Iingrediente {
	public double IngredientQuantidade;
	
	private IngredienteTomate() {}
	
	public static IngredienteTomate Build() {
		return new IngredienteTomate();
	}
	
	public String getTipoIngredient() {
		return "Tomate";
	}

	public double getIngredientQuantidade() {
		return IngredientQuantidade;
	}

	public IngredienteTomate setIngredientQuantidade(double ingredientQuantidade) {
		IngredientQuantidade = ingredientQuantidade;
		return this;
	}
	
}
