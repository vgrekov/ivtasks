package vgrekov.ivtasks.easy;

public class PalindromeNumber {

	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false; // negative numbers are not palindrome
		} else if (x < 10) {
			return true; // single digit numbers are palindrome
		} else if (x % 10 == 0) {
			return false; // ends with zero - not palindrome
		}

		int reverted = 0;
		while (x > reverted) {
			reverted = reverted * 10 + x % 10;
			x /= 10;
		}

		return x == reverted || x == reverted / 10;
	}

}
