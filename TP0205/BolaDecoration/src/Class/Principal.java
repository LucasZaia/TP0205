package Class;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bola bola = new BolaImplment();
		
		System.out.println(bola.acao());
		
		Bola bolaPinga = new BolaPingar(bola);
		
		System.out.println(bolaPinga.acao());
		
		Bola bolaQuica = new BolaQuicar(bola);
		
		System.out.println(bolaQuica.acao());
		
		
		
	}

}
