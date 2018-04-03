package vgrekov.ivtasks.medium;

public class StringToInteger {

	public int myAtoi(String str) {
		if (str == null || str.isEmpty()) {
			return 0;
		}

		int MAX_BASE = Integer.MAX_VALUE / 10;
		int factor = 1;
		int result = 0;
		int i = 0;

		for (; i < str.length(); i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				break;
			}
		}

		if (i < str.length()) {
			char c = str.charAt(i);
			if (c == '-' || c == '+') {
				factor = c == '-' ? -1 : 1;
				i++;
			}

			for (; i < str.length(); i++) {
				c = str.charAt(i);
				if (c >= '0' && c <= '9') {
					int digit = c - '0';
					if (result > MAX_BASE || Integer.MAX_VALUE - result * 10 < digit) {
						return factor == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
					}
					result = result * 10 + digit;
				} else {
					break;
				}
			}
		}

		return result * factor;
	}

}
