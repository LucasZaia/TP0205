package Observer;


public interface Observable {
	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObserver();
	public String getItem();
}
