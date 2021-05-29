package Adapter;

public class Principal {

	public static void main(String[] args) {
		
		IMassa astronauta = new Astronauta();
		
		IMassaAdapter massaGravidade = new MassaAdapter(astronauta);
		
		System.out.println("Massa do astronauta: " + astronauta.calculaConstante());
		System.out.println("Massa do astronauta calculado Vezes o valor da gravidade"
				+ ": " + massaGravidade.calculaConstante());
		
		

	}

}
