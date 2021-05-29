package FactoryMethod;

public class Main {

	public static void main(String[] args) {
		
		Inumbers number1 = FactoryNumbers.build("number1");
		Inumbers number2 = FactoryNumbers.build("number2");
		
		System.out.println("Value is: " + number1.getNumber());
		System.out.println("Value is: " + number2.getNumber());
		
	}

}
