package Observer;

import java.util.ArrayList;
import java.util.List;

public class Item implements Observable {
	
	

	private String item;
	
	private List<Observer> clients = new ArrayList<Observer>(); 

	public void itemDispon() {
		this.item = "Novo item Disponivel";
		notifyObserver();
	}
	
	@Override
	public void addObserver(Observer o) {
		clients.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		clients.remove(o);
	}

	@Override
	public void notifyObserver() {
		for(Observer clt : clients) {
			clt.update();
		}
	}
	
	public String getItem() {
		return item;
	}

}
