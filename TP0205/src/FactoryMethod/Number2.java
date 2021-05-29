package FactoryMethod;

public class Number2 implements Inumbers{
	
	private Number2() {}

	public static Number2 build() {
		return new Number2();
	}
	@Override
	public double getNumber() {
		return 100;
	}
	
}
