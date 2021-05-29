package AbstractFactory;

public class FactoryFruta implements AbstractFactoryFruta<IFruta>{

	@Override
	public IFruta colhe(String fruta) {
		
		switch(fruta) {
			case "banana":
				return new Banana();
			default:
				throw new Error("Fruta Invalida");
		}
		
		
		
	}

}
