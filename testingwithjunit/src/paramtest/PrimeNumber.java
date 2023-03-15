package paramtest;

public class PrimeNumber {

	public boolean Validate(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count += 1;
		}
		if (count == 2)
			return true;
		else
			return false;

	}
}
