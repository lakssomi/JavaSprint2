package javaprogrames;

import java.util.TreeSet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GitAssignment {
	public String formatted_string(String m) {

		StringBuffer upper = new StringBuffer();
		StringBuffer lower = new StringBuffer();
		StringBuffer digit = new StringBuffer();
		StringBuffer spaces = new StringBuffer();
		StringBuffer concatStr = new StringBuffer();

		if (m.length() == 0)
			return m;

		for (char alpha : m.toCharArray()) {

			if (Character.isAlphabetic(alpha)) {
				if (Character.isUpperCase(alpha))
					upper.append(alpha);
				else
					lower.append(alpha);

			} else if (Character.isDigit(alpha)) {

				digit.append(alpha);
			} else if (Character.isSpaceChar(alpha)) {
				spaces.append(alpha);
			}
		}

		concatStr.append(upper);
		concatStr.append(lower);
		concatStr.append(spaces);
		concatStr.append(digit);

		System.out.println("output--->" + concatStr);
		return concatStr.toString();

	}

	public String sortWithCollection(String inputStr) {
		TreeSet<Character> ts = new TreeSet<Character>();

		for (char ch : inputStr.toCharArray()) {
			ts.add(ch);
		}

		StringBuffer str = new StringBuffer();
		for (Character outputStr : ts)
			str.append(outputStr);

		return formatted_string(str.toString());
	}

	@Test
	public void testCase1() {
		String m = "Show09allBC 1950AD";
		String actual = sortWithCollection(m);
		Assert.assertEquals(actual, "ABCDSahlow 0159");
	}

	@Test
	public void testCase2() {
		String m = "AGAREE 387483 ksjfkldsj";
		String actual = sortWithCollection(m);
		Assert.assertEquals(actual, "AEGRdfjkls 3478");
	}

	@Test
	public void testCase3() {
		String m = "";
		String actual = sortWithCollection(m);
		Assert.assertEquals(actual, "");
	}

	@Test
	public void testCase4() {
		String m = "skjdfkdj WERWERWE @$#$ 38945834";
		String actual = sortWithCollection(m);
		Assert.assertEquals(actual, "ERWdfjks 34589");
	}

}
