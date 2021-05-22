package Singleton;

public class Principal {

	public static void main(String[] args) {
			
		Singleton instance = null;
		
		instance = Singleton.getInstance();
		
		instance.setTexto("Teste");
		
		System.out.println("Mensagem: " + instance.getTexto());
		
		System.out.println("Caminho Singleton em memória: " + instance);

	}

}
