package javaprogrames;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HclAssignment {
	public String haclassignment(String str) {

		int count = 1;
		int temp;
		String s1 = "";

		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;

			}
			if (str.charAt(i) != str.charAt(i + 1) || i + 1 == str.length() - 1) {

				s1 = s1 + count + str.charAt(i);
				System.out.println(count + str.charAt(i));
				count = 1;

			}
			System.out.println("count" + count);
			System.out.println("str.charAt(i)" + str.charAt(i));

		}
		return s1;

	}

	@Test
	public void testcase1() {
		String s1 = "aaabbcaacccbb";
		String s2 = haclassignment(s1);
		System.out.println(s2);
		Assert.assertEquals(s2, "3a2b1c2a3c2b");

	}

	@Test
	public void testcase2() {
		String s1 = "accecddcabb";
		String s2 = haclassignment(s1);
		System.out.println(s2);
		Assert.assertEquals(s2, "1a2c1e1c2d1c1a2b");

	}
}
