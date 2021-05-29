package Ingrediente;

public class IngredienteCebola implements Iingrediente {
	private double IngredientQuantidade;
	
	private IngredienteCebola() {}
	
	public static IngredienteCebola Build() {
		return new IngredienteCebola();
	}
	
	public String getTipoIngredient() {
		return "Cebola";
	}

	public double getIngredientQuantidade() {
		return IngredientQuantidade;
	}

	public IngredienteCebola setIngredientQuantidade(double ingredientQuantidade) {
		IngredientQuantidade = ingredientQuantidade;
		return this;
	}
}
