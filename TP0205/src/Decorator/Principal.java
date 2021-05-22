package Decorator;

public class Principal {

	public static void main(String[] args) {
		
		Carro car = new CarroImpl();
		
		System.out.println(car.modificacao());
		
		Carro carTetoSolar = new CarroTetoSolar(car);
		
		System.out.println(carTetoSolar.modificacao());

	}

}
