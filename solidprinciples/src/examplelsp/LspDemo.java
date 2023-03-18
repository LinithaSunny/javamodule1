package examplelsp;

public class LspDemo {
	
	public void calculateShape(Shape s)
	{
		System.out.println(s.getArea());
	}
	
	public static void main(String[] args) {
		LspDemo lsp = new LspDemo();
		lsp.calculateShape(new Rectangle(1,4));
		lsp.calculateShape(new Square(5));
	}

}
