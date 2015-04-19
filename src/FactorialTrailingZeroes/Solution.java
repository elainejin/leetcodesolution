package FactorialTrailingZeroes;

public class Solution {

	public static int trailingZeroes(int n) {
		int count = 0;
		long i = 5;
		while (i <= n) {
			count += n / i;
			i *= 5;
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trailingZeroes(30));
	}

}
