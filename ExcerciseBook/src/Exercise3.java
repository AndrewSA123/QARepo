
public class Exercise3 {

	public static void main(String[] args) {

		int Physics = 150;
		int Chemistry = 150;
		int Biology = 59;

		results(Physics, Chemistry, Biology);
		System.out.print(Percentage(Physics, Chemistry, Biology));
	}

	public static int results(int a, int b, int c) {
		int results = 0;

		int d = a + b + c;

		System.out.println("Physics: " + a);
		System.out.println("Chemistry: " + b);
		System.out.println("Biology: " + c);
		System.out.println("Total: " + d);

		return results;
	}

	public static double Percentage(int a, int b, int c) {
		int results = 0;
		double percentage;
		results = (a + b + c) * 100;
		percentage = results / 450;

		if (percentage >= 60 && a >= 60 && b >= 60 && c >= 60) {
			System.out.println("Congratulations you passed!");
		} else if (a < 60) {
			System.out.println("You failed Physics");
		} else if (b < 60) {
			System.out.println("You failed Chemistry");
		} else if (c < 60) {
			System.out.println("You failed Biology");
		} else {
			System.out.println("What did you do?");
		}

		return percentage;
	}

}
