package vgrekov.ivtasks.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanToIntegerTest {

	@Test
	public void testRomanToInt() {
		RomanToInteger task = new RomanToInteger();
		assertEquals(3, task.romanToInt("III"));
		assertEquals(4, task.romanToInt("IV"));
		assertEquals(9, task.romanToInt("IX"));
		assertEquals(58, task.romanToInt("LVIII"));
		assertEquals(1994, task.romanToInt("MCMXCIV"));
	}

}
