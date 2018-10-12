
public class Reverse {

	public static void main(String[] args) {

		String str = "Hello World";
		String NewStr = "";
		char[] strArray = str.toCharArray();

		for (int i = strArray.length - 1; i > -1; i--) {

			char tempChar = strArray[i];



			NewStr += tempChar;

		}

		System.out.println(NewStr);

	}

}
