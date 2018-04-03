package vgrekov.ivtasks.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringToIntegerTest {

	@Test
	public void testMyAtoi() {
		StringToInteger task = new StringToInteger();
		assertEquals(0, task.myAtoi(""));
		assertEquals(0, task.myAtoi("-0"));
		assertEquals(0, task.myAtoi("+-2"));
		assertEquals(0, task.myAtoi("   "));
		assertEquals(0, task.myAtoi("   a-b12  "));
		assertEquals(0, task.myAtoi("   ab-12  "));
		assertEquals(0, task.myAtoi(" ab+-cd123 456fg-a+ "));
		assertEquals(0, task.myAtoi("fgh-=+-+4.34"));
		assertEquals(Integer.MAX_VALUE, task.myAtoi("+2147483647"));
		assertEquals(Integer.MAX_VALUE, task.myAtoi("+2147483648"));
		assertEquals(Integer.MIN_VALUE, task.myAtoi("-2147483648"));
		assertEquals(Integer.MIN_VALUE, task.myAtoi("-214748364812345"));
		assertEquals(0, task.myAtoi(" b11228552307"));
	}

}
