package ZigZagConversion;

public class Solution {
	public static String convert(String s, int nRows) {
		if ((nRows == 1) || (s.length() < nRows))
			return s;
		int move = 1;
		int target = 0;
		String[] result = new String[nRows];
		for (int i = 0; i < s.length(); i++) {
			if (target % (2 * nRows - 2) == 0) {
				move = 1;
			} else if (target % (nRows - 1) == 0) {
				move = -1;
			}
			if (result[target] == null) {
				result[target] = "";
			}
			result[target] += s.charAt(i);

			target += move;
		}

		StringBuilder builder = new StringBuilder();
		for (String r : result) {
			builder.append(r);
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert("PAYPALISHIRING", 3));
	}

}
