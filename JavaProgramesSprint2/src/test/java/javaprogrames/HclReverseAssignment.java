package javaprogrames;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HclReverseAssignment {
	public String reverseStrings(String s) {
		StringBuffer sb = new StringBuffer();
		String arr[] = s.split(" ");
		String temp = arr[0];
		arr[0] = arr[2];
		arr[2] = temp;
		for (String str : arr) {
			if (str.equals(arr[arr.length - 1]))
				sb.append(str);
			else
				sb.append(str + " ");
		}
		System.out.println(sb);
		return sb.toString();
	}

	@Test
	public void testCase2() {
		String s = "I am Mohan from Bangalore";
		String actual = reverseStrings(s);
		Assert.assertEquals(actual, "Mohan am I from Bangalore");
	}

}
