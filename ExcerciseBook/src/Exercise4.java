import java.util.Arrays;
import java.util.List;

public class Exercise4 {

	public static void main(String[] args) {

		int number1 = 10;
		int number2 = 9;
		boolean Check = false;

		int number = 3000;

		List<Integer> NewList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);



		System.out.println(conditionals(number1, number2, Check));

		FlowChart(number);

	}

	public static void FlowChart(int a) {
		if (a > 2000) {
			System.out.println("A");
			if (a > 6000) {
				System.out.println("C");
			} else {
				System.out.println("B");
				if (a > 4000) {
					System.out.println("D");
				} else {
					System.out.println("E");
				}
			}
		} else {
			if (a > 100) {
				System.out.println("3");
				if (a > 600) {
					System.out.println("5");
				} else {
					System.out.println("4");
					if (a > 500) {
						System.out.println("6");
					} else {
						System.out.println("7");
					}
				}
			} else {
				System.out.println("2");
			}
		}
	}

	public static int conditionals(int a, int b, boolean c) {

		if (c == true) {
			return a + b;
		} else if (c == false) {
			return a * b;
		} else if (a % 2 == 0 || b % 2 == 0) {
			return 0;
		} else {
			return a * b;
		}
	}

}
