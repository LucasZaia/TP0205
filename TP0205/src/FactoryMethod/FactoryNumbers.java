package FactoryMethod;

public class FactoryNumbers{
	
	private FactoryNumbers() {}
	
	public static Inumbers build(String number) {
		switch (number) {
		case "number1": 
			return Number1.build();
		case "number2": 
			return Number2.build();
		default:
			throw new Error("Unexpected value: " + number);
		}
	}
}
