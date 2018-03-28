package vgrekov.ivtasks.medium;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import vgrekov.ivtasks.medium.AddTwoNumbers.ListNode;

public class AddTwoNumbersTest {

	@Test
	public void testAddTwoNumbers() {
		AddTwoNumbers task = new AddTwoNumbers();
		assertArrayEquals(new int[] { 7, 0, 8 }, listNodeToDigits(
				task.addTwoNumbers(digitsToListNode(new int[] { 2, 4, 3 }), digitsToListNode(new int[] { 5, 6, 4 }))));
	}

	@Test
	public void testConversion() {
		assertArrayEquals(new int[] { 2, 4, 3 }, listNodeToDigits(digitsToListNode(new int[] { 2, 4, 3 })));
	}

	private ListNode digitsToListNode(int... digits) {
		ListNode result = null;
		ListNode node = null;
		for (int digit : digits) {
			if (node == null) {
				node = new ListNode(digit);
				result = node;
			} else {
				node.next = new ListNode(digit);
				node = node.next;
			}
		}
		return result;
	}

	private int[] listNodeToDigits(ListNode node) {
		List<Integer> digitsList = new ArrayList<>();
		while (node != null) {
			digitsList.add(node.val);
			node = node.next;
		}
		int[] digits = new int[digitsList.size()];
		for (int i = 0; i < digitsList.size(); i++) {
			digits[i] = digitsList.get(i);
		}
		return digits;
	}

}
