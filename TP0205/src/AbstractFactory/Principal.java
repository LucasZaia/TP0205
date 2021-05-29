package AbstractFactory;

public class Principal {

	public static void main(String[] args) {
		IFruta fruta = (IFruta) FactorydeFactory.fabricaFruta("fruta").colhe("banana");
		
		System.out.println("Fruta Colhida: " + fruta.pegaFruta());
	}

}
