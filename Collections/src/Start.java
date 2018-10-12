import java.util.ArrayList;
import java.util.List;
public class Start {

	public static void main(String[] args) {


		int[] intarray = new int[100];
		int[] intarray2 = new int[999];

		intarray = Array1();
		intarray2 = Array2();

		iter(intarray);


	}

	public static int[] Array1() {

		int[] temparray = new int[101];
		for (int i = 1; i <= 100; i++) {

			System.out.println(i);

			temparray[i] = i;
		}

		return temparray;
	}

	public static int[] Array2() {

		int[] temparray = new int[1000];
		for (int i = 1; i <= 999; i++) {

			System.out.println(i);
			System.out.println(EnglishNumberToWords.convert(i));

			temparray[i] = i;
		}

		return temparray;
	}

	public static int iter(int[] temparray) {
		temparray = new int[99999999];
		List<Integer> intList = new ArrayList<Integer>();

		for (int i = 0; i < temparray.length; i++) {
			intList.add(i);
		}

		int a = 0;
		int b = 0;
		for (int i = 0; i < temparray.length; i++) {

			b = intList.get(i);
		}
		System.out.println(b * 10);
		return b + 10;
	}

}

