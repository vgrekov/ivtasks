package vgrekov.ivtasks.easy;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TwoSumTest {

	@Test
	public void testTwoSum() {
		TwoSum task = new TwoSum();
		assertArrayEquals(new int[] { 0, 1 }, task.twoSum(new int[] { 2, 7, 11, 15 }, 9));
		assertArrayEquals(new int[] { 1, 2 }, task.twoSum(new int[] { 3, 2, 4 }, 6));
	}

}
