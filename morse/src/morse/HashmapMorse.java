package morse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashmapMorse {

	static HashMap<String, String> map = new HashMap<>();

	public static void main(String[] args) {

		morseToEnglish(".- -.. .. .-..");

	}

	public static void morseToEnglish(String a) {
		String morseCode = a;
		List<String> morseList = new ArrayList<>(Arrays.asList(morseCode.split(",")));
		System.out.println(morseList);

		map.put(".-", "a");
		map.put("-...", "b");
		map.put("-.-.", "c");
		map.put("-..", "d");
		map.put(".", "e");
		map.put("..-.", "f");
		map.put("--.", "g");
		map.put("....", "h");
		map.put("..", "i");
		map.put(".---", "j");
		map.put("-.-", "k");
		map.put(".-..", "l");
		map.put("--", "m");
		map.put("-.", "n");
		map.put("---", "o");
		map.put(".--.", "p");
		map.put("--.-", "q");
		map.put(".-.", "r");
		map.put("...", "s");
		map.put("-", "t");
		map.put("..-", "u");
		map.put("...-", "v");
		map.put(".--", "w");
		map.put("-..-", "x");
		map.put("-.--", "y");
		map.put("--..", "z");

		for (int i = 0; i < morseList.size(); i++) {
			map.get(morseList.get(i));
			System.out.println(map.get(morseList.get(i)));
		}

	}

}
