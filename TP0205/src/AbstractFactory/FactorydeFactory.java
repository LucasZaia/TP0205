package AbstractFactory;

public class FactorydeFactory {
	
	public static AbstractFactoryFruta<?> fabricaFruta(String fabrica){
		
		switch(fabrica) {
			case "fruta":
				return new FactoryFruta();
			default:
				throw new Error("Fabrica Errada");
		}
	}

}
