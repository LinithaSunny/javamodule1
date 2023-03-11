package oopsday3;

public class Calc {
	private int n;
	
	public Calc() {
		// TODO Auto-generated constructor stub
	}

	public Calc(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return "Calc [n=" + n + "]";
	}
	
	

}
