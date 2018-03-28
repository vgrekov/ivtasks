package vgrekov.ivtasks.easy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeNumberTest {

	@Test
	public void testIsPalindrome() {
		PalindromeNumber task = new PalindromeNumber();
		assertTrue(task.isPalindrome(1));
		assertTrue(task.isPalindrome(1234321));
		assertTrue(task.isPalindrome(12344321));
		assertFalse(task.isPalindrome(123443421));
		assertFalse(task.isPalindrome(-2147483648));
		assertFalse(task.isPalindrome(1000021));
		assertFalse(task.isPalindrome(10));
	}

}
