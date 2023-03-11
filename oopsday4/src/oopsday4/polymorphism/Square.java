package oopsday4.polymorphism;

public class Square extends Shape {
	
	private int side;
	public Square() {
		// TODO Auto-generated constructor stub
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public Square(int side) {
		super();
		this.side = side;
	}
	
	public double area()
	{
		return this.side*this.side;
	}

}
