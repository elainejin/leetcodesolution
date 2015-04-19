package LongestSubstring;

import java.util.HashMap;

public class Solution {

	public int lengthOfLongestSubstring(String s) {
		char[] source = s.toCharArray();
		int count = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < source.length; i++) {
			if (map.containsKey(source[i])) {
				count = Math.max(count, map.size());
				i = map.get(source[i]);
				map.remove(source[i]);
			} else {
				map.put(source[i], i);
			}
		}
		return Math.max(count, map.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
