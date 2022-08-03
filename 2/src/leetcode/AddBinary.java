package leetcode;

public class AddBinary {

	public static String addBinary(String a, String b) {

		int i = a.length() - 1, j = b.length() - 1, carry = 0;
		StringBuilder sb = new StringBuilder();

		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0) {
				sum += a.charAt(i) - '0';
				i--;
			}
			if (j >= 0) {
				sum += b.charAt(j) - '0';
				j--;
			}
			if (sum % 2 == 0) {
				sb.append("0");
			} else
				sb.append("1");

			carry = sum / 2;
		}
		if (carry != 0)
			sb.append(carry);

		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(AddBinary.addBinary("10110", "1011"));
		// TODO Auto-generated method stub

	}

}
