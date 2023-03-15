package testlambdas;

public class LambdaSwitchCase {
	static double Calculate(String operator,double x,double y) {
	
	return switch(operator)
{
	case "+" -> x+y;
	case "-" -> x-y;
	case "*" -> x*y;
	case "/" -> {
		if(y==0)
		{
			throw new IllegalArgumentException("Can't didvide by zero");
		}
		yield x/y;
	}
	default -> throw new IllegalArgumentException("Unknown Operation");
};

			

}
public static void main(String[] args) {
	LambdaSwitchCase op = new LambdaSwitchCase();
	System.out.println(op.Calculate("+", 3, 4));
//	System.out.println(op.Calculate("!", 3, 4));
	System.out.println(op.Calculate("-", 3, 4));
	System.out.println(op.Calculate("*", 3, 4));
	System.out.println(op.Calculate("/", 3, 4));
	System.out.println(op.Calculate("/", 3, 0));
}
}

