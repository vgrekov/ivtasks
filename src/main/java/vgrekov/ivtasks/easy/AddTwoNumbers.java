package vgrekov.ivtasks.easy;

public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode container = new ListNode(0);
		ListNode node = container;
		while (l1 != null || l2 != null) {
			int n = 0;
			if (l1 != null) {
				n += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				n += l2.val;
				l2 = l2.next;
			}
			
			if (node.next == null) {
				node.next = new ListNode(n);
			} else {
				node.next.val += n;
			}
			
			node = node.next;
			
			if (node.val >= 10) {
				node.next = new ListNode(1);
				node.val = node.val % 10;
			}
		}
		return container.next;
	}

	public static class ListNode {

		public int val;

		public ListNode next;

		public ListNode(int val) {
			this.val = val;
		}

	}

}
