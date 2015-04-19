package CompareVersionNumbers;

public class Solution {

	public static int compareVersion(String version1, String version2) {
		String[] r1 = version1.split("\\.");
		String[] r2 = version2.split("\\.");
		int i = 0;
		while (i < r1.length && i < r2.length) {
			if (Integer.valueOf(r1[i]) < Integer.valueOf(r2[i]))
				return -1;
			else if (Integer.valueOf(r1[i]) > Integer.valueOf(r2[i]))
				return 1;
			i++;
		}
		if (r1.length == r2.length)
			return 0;
		else if (r1.length > r2.length)
			if (Integer.valueOf(r1[i]) == 0)
				return 0;
			else
				return 1;
		else if (Integer.valueOf(r2[i]) == 0)
			return 0;
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(compareVersion("1", "0"));
	}

}
