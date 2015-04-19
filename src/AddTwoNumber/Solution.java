package AddTwoNumber;

public class Solution {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode result = new ListNode(0);
		ListNode head = result;
		int sum = 0;

		while (l1 != null || l2 != null) {
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}

			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}

			result.next = new ListNode(sum % 10);
			result = result.next;
			sum /= 10;
		}

		if (sum == 1)
			result.next = new ListNode(1);

		return head.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(8);
		ListNode l2 = new ListNode(0);
		System.out.println(l1.val + "," + l1.next.val);
		System.out.println(l2.val);
		ListNode result = addTwoNumbers(l1, l2);
		System.out.println(result.val + "," + result.next.val);
	}

}
