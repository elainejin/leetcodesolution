package MajorityElement;

import java.util.HashMap;

public class Solution {

	public int majorityElement(int[] num) {
		// Arrays.sort(num);
		// return num[num.length/2];

		HashMap<Integer, Integer> dic = new HashMap<Integer, Integer>();
		int max = 0;
		int count = 0;
		for (int i : num) {
			if (!dic.containsKey(i))
				dic.put(i, 1);
			else
				dic.put(i, dic.get(i) + 1);
			if (dic.get(i) > count) {
				max = i;
				count = dic.get(i);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
