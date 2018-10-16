
public class Condense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compare();

//	public static String condence1(String s1, String s2) {
//		String newStr = (s2.substring(0, 2));
//		String newStr2 = (s1.substring(s1.length() - 2));
//		if (newStr.equals(newStr2)) {
//			return (s1 + s2.substring(Math.min(s2.length(), 2)));
//		}
//		return " a";
//	}

	public static void compare() {
		String string2 = "adhu";
		String stringUnreversed = "lida";
		StringBuffer st2;
		String emptyS = " ";

		// reverse string2
		StringBuffer str2 = new StringBuffer(stringUnreversed);
		StringBuffer string1 = str2.reverse();
		string1.toString();

		int min = 0;

		if (string2.length() <= string1.length()) {
			min = string2.length();
		} else {
			min = string1.length();
		}

		for (int i = 0; i < min; i++) {

			if (string1.charAt(i) == string2.charAt(i)) {
				char ch = string1.charAt(i);
				emptyS += ch;
			}
		}

		System.out.println(stringUnreversed + (string2.substring(emptyS.length() - 1, string2.length())));

	}

}
