public class Exercise2 {

	public static void main(String[] args) {

		int number1 = 5;
		int number2 = 16;

		System.out.println(Addition(number1, number2));
		System.out.println(subtraction(number1, number2));
		System.out.println(multiplication(number1, number2));
		System.out.println(division(number1, number2));

	}

	public static int Addition(int a, int b) {
		int Answer = a + b;
		return Answer;
	}

	public static int subtraction(int a, int b) {
		int Answer = a - b;
		return Answer;
	}

	public static int multiplication(int a, int b) {
		int Answer = a * b;
		return Answer;
	}

	public static double division(int a, int b) {
		double Answer = 0;
		if (a > b) {
			Answer = a / b;
		} else {
			System.out.println("Error");
		}

		return Answer;
	}

}
