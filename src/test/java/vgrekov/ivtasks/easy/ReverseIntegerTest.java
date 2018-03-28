package vgrekov.ivtasks.easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseIntegerTest {

	@Test
	public void testReverse() {
		ReverseInteger task = new ReverseInteger();
		assertEquals(321, task.reverse(123));
		assertEquals(-321, task.reverse(-123));
		assertEquals(21, task.reverse(120));
		assertEquals(0, task.reverse(Integer.MIN_VALUE));
		assertEquals(0, task.reverse(Integer.MAX_VALUE));
	}

}
