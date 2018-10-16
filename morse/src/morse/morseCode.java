package morse;

public class morseCode {

	public static void main(String[] args) {
		System.out.println(decode(
				".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / "));
	}

	static String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
			"s", "t", "u", "v", "w", "x", "y", "z" };
	static String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
			"--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

	public static String decode(String morseCode) {
		String build = "";
		String change = morseCode.trim();
		String[] words = change.split("   ");

		for (String word : words) {

			for (String letter : word.split(" ")) {

				for (int x = 0; x < morse.length; x++) {

					if (letter.equals(morse[x])) {
						build = build + alpha[x];
					}
				}
			}
			build += " ";
		}

		return build;
	}

}