package Atm;

public class NoteCount {
	
	private int hundred=100;
	private int fifty=100;
	
	public NoteCount() {
		// TODO Auto-generated constructor stub
	}

	public int getHundred() {
		return hundred;
	}

	public void setHundred(int hundred) {
		this.hundred = hundred;
	}

	public int getFifty() {
		return fifty;
	}

	public void setFifty(int fifty) {
		this.fifty = fifty;
	}

	public NoteCount(int hundred, int fifty) {
		super();
		this.hundred = hundred;
		this.fifty = fifty;
	}
	
	
	

	

}
