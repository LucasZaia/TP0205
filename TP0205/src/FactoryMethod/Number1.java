package FactoryMethod;

public class Number1 implements Inumbers{

	private Number1() {}
	
	public static Number1 build() {
		return new Number1();
	}
	
	@Override
	public double getNumber() {
		return 51;
	}

}
