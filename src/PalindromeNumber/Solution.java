package PalindromeNumber;

public class Solution {

	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		else if (x < 10)
			return true;
		else if (x < 100) {
            return x % 10 == x / 10;
		} else {
			int last = x % 10;
			if (Integer.toString(x).charAt(0) != Integer.toString(x).charAt(
					Integer.toString(x).length() - 1))
				return false;
			else {
				x = (x - (int) (Math.pow(10, Integer.toString(x).length() - 1) * last)) / 10;
				return isPalindrome(x);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(212));
		System.out.println(isPalindrome(1221));
		System.out.println(isPalindrome(126621));
		System.out.println(isPalindrome(326621));
	}

}
