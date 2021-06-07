package Observer;

public class Principal {

	public static void main(String[] args) {
		
		Item item = new Item();
		
		Observer cl = new ClientShop(item,"Juvenal");
		Observer cl2 = new ClientShop(item,"Joemir");
			
		item.addObserver(cl);
		item.addObserver(cl2);
		
		item.itemDispon();


	}

}
