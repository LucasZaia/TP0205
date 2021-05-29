package Facade;

public class PlayFone {
	
	private IFone rock;
	private IFone pagode;
	
	public PlayFone() {
		this.pagode = new TocaPagode();
		this.rock = new TocaRock();	
	}
	
	public void tocarPagode() {
		this.pagode.tocar();
	}
	public void tocarRock() {
		this.rock.tocar();
	}
}
