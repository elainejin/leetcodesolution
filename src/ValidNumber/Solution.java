package ValidNumber;

public class Solution {

	public static boolean isNumber(String s) {
		// s = s.toLowerCase();
		// if (s.contains("a") || s.contains("b") || s.contains("c")
		// || s.contains("d") || s.contains("f") || s.contains("g")
		// || s.contains("h") || s.contains("i") || s.contains("j")
		// || s.contains("k") || s.contains("l") || s.contains("m")
		// || s.contains("n") || s.contains("o") || s.contains("p")
		// || s.contains("q") || s.contains("r") || s.contains("x")
		// || s.contains("t") || s.contains("u") || s.contains("v")
		// || s.contains("w") || s.contains("x") || s.contains("y")
		// || s.contains("z"))
		char[] chars = s.toLowerCase().toCharArray();

		for (char c : chars) {
			if (Character.isLetter(c) && c != 'e') {
				return false;
			}
		}

		try {
			Double d = Double.valueOf(s);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Boolean.toString(isNumber("0")));

		System.out.println(Boolean.toString(isNumber(" 0.1 ")));

		System.out.println(Boolean.toString(isNumber("abc")));

		System.out.println(Boolean.toString(isNumber("1 a")));

		System.out.println(Boolean.toString(isNumber("2e10")));

	}

}
