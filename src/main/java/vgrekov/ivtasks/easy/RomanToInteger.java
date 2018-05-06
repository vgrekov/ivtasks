package vgrekov.ivtasks.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	private static final Map<Character, Integer> ROMAN_NUMERALS = new HashMap<>();

	static {
		ROMAN_NUMERALS.put('I', 1);
		ROMAN_NUMERALS.put('V', 5);
		ROMAN_NUMERALS.put('X', 10);
		ROMAN_NUMERALS.put('L', 50);
		ROMAN_NUMERALS.put('C', 100);
		ROMAN_NUMERALS.put('D', 500);
		ROMAN_NUMERALS.put('M', 1000);
	}

	public int romanToInt(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			int n = ROMAN_NUMERALS.get(s.charAt(i));
			if (i < s.length() - 1 && n < ROMAN_NUMERALS.get(s.charAt(i + 1))) {
				n = -n;
			}
			result += n;
		}
		return result;
	}

}
