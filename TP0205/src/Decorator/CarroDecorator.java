package Decorator;

public class CarroDecorator implements Carro {

	public Carro car;
	
	public CarroDecorator(Carro car) {
		this.car = car;
	}
	
	@Override
	public String modificacao() {
		return car.modificacao();
	}

}
