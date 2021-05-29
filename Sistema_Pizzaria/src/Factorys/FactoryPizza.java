package Factorys;

import Pizza.IPizza;
import Pizza.PizzaCalabresa;
import Pizza.PizzaFrango;
import enums.Enums;

public class FactoryPizza {
	
	private FactoryPizza() {}
	
	public static IPizza BuildPizza(Enums enums) {
		switch (enums) {
		case PizzaCalabresa: 
			return PizzaCalabresa.Build();
		case PizzaFrango:
			return PizzaFrango.Build();
		default:
			throw new Error("Erro! Pizza não existe");
		}
	}
}
