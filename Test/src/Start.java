import java.util.Scanner;

public class Start {

	public static void main(String[] args) {

		Boolean doAgain = true;

		Scanner s = new Scanner(System.in);

		int GVNumber1;
		int GVNumber2;
		int GVOperator;

		System.out.println("intput number 1");
		GVNumber1 = s.nextInt();

		System.out.println("intput number 2");
		GVNumber2 = s.nextInt();

		System.out.println("Type 1 for +, 2 for -, 3 for /, 4 for *");
		GVOperator = s.nextInt();

		System.out.println(Calc(GVNumber1, GVNumber2, GVOperator));

	}

	public static double Calc(int number1, int number2, int operator) {

		double answer = 0;

		switch (operator) {
		case 1:
			answer = number1 + number2;
			break;
		case 2:
			answer = number1 - number2;
			break;
		case 3:
			answer = number1 / number2;
			break;
		case 4:
			answer = number1 * number2;
			break;
		}

		return answer;
	}

}
