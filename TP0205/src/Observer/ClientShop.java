package Observer;

public class ClientShop implements Observer {
	
	private Observable observable;
	
	private String nome;
	
	public ClientShop(Observable observable, String nome) {
		this.observable = observable;
		this.nome = nome;
	}
	
	@Override
	public void update() {
		System.out.println("Caro Cliente " + this.nome +" "+ observable.getItem());
	}
}
