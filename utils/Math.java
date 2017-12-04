package utils;

public class Math {
	public static int factorial(double num) {
		int numInt = (int) num;

		if(numInt < 1) {
			return 1;
		}

		return numInt * factorial(numInt-1);
	}

	public static int factorialLoop(double num) {
		int numInt = (int) num;
		int result = 1;

		for(int i = numInt; i > 0; i--) {
			result = result * i;
		}

		return result;

	}

}
