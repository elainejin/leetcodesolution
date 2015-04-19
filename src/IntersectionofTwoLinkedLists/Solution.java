package IntersectionofTwoLinkedLists;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}

	ListNode(int x, int y) {
		val = x;
		next = new ListNode(y);
	}
}

public class Solution {
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode tA = headA;
		ListNode tB = headB;

		if (tA == null || tB == null)
			return null;

		while (tA.val != tB.val) {
			if (tA.next == null && tB.next == null)
				return null;
			if (tA.next != null)
				tA = tA.next;
			else
				tA = headB;
			if (tB.next != null)
				tB = tB.next;
			else
				tB = headA;
		}
		return tA;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode headA = new ListNode(3);
		ListNode headB = new ListNode(2, 3);
		System.out.println(getIntersectionNode(headA, headB).val);
	}
}