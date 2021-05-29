package Factorys;

import Ingrediente.Iingrediente;
import Ingrediente.IngredienteCebola;
import Ingrediente.IngredienteTomate;
import enums.EnumIngredient;


public class FactoryIngrediente {
	
	private FactoryIngrediente() {}
	
	public static Iingrediente Build(EnumIngredient enumIngrediente) {
		switch (enumIngrediente) {
		case IngredienteTomate:
			return IngredienteTomate.Build();
		case IngredienteCebola:
			return IngredienteCebola.Build();
		default:
			throw new Error("Ingrediente Inválido");
		}
	}
}
