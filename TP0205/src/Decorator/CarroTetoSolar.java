package Decorator;

public class CarroTetoSolar extends CarroDecorator{

	public CarroTetoSolar(Carro car) {
		super(car);
	}
	
	public String TetoSolar() {
		return "instalado Teto Solar";
	}
	
	public String modificacao() {
		return car.modificacao() + TetoSolar(); 
	}
	
}
