import java.util.Random;

public class Exercise5 {

	public static void main(String[] args) {

		Random Rand = new Random();
		int a = Rand.nextInt(22);
		int b = Rand.nextInt(22);

		System.out.println(BlackJack(a, b));


	}

	public static int BlackJack(int a, int b) {

		if (a > b) {
			return a;
		} else if (a < b) {
			return b;
		} else {
			return 0;
		}
	}

}
