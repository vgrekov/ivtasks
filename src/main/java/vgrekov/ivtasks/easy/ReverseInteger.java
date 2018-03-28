package vgrekov.ivtasks.easy;

public class ReverseInteger {

	public int reverse(int x) {
		int y = 0;
		while (x != 0) {
			int oldY = y;
			int digit = x % 10;
			y = y * 10 + digit;

			// overflow check
			if (oldY != (y - digit) / 10) {
				return 0;
			}

			x /= 10;
		}
		return y;
	}

}
