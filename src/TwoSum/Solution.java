package TwoSum;

import java.util.HashMap;

public class Solution {

	public static int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];

		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				result[0] = map.get(numbers[i]) + 1;
				result[1] = i + 1;
				break;
			} else {
				map.put(target - numbers[i], i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 3, 2, 4 };
		int target = 6;
		int[] result = twoSum(numbers, target);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}

}
