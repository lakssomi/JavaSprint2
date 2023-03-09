package javaprogrames;

import java.util.ArrayList;
import java.util.Collections;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GitAssignment1 {
	Character c;

	public String formatted_string(String m) {
		ArrayList<Character> capital = new ArrayList(), small = new ArrayList(), numbers = new ArrayList();
		ArrayList<Character> spaces = new ArrayList();

		for (Character c : m.toCharArray()) {
			if (Character.isLetter(c)) {
				if (Character.isUpperCase(c)) {
					capital.add(c);
				} else {
					small.add(c);
				}
			} else if (Character.isDigit(c)) {
				numbers.add(c);

			} else if (Character.isSpaceChar(c)) {
				spaces.add(c);

			}
		}
		Collections.sort(capital);
		Collections.sort(small);
		Collections.sort(numbers);

		StringBuilder output = new StringBuilder();

		for (Character c1 : capital) {
			output.append(c1);
		}
		for (Character c2 : small) {
			output.append(c2);
		}
		for (Character c3 : spaces) {
			output.append(c3);
		}
		for (Character c4 : numbers) {
			output.append(c4);
		}

		System.out.println(output.toString());

		return output.toString();

	}

	@Test
	public void testCase1() {
		String m = "Show09allBC 1950AD";
		String actual = formatted_string(m);
		System.out.println(actual);
		Assert.assertEquals(actual, "ABCDSahllow 001599");
	}

	@Test
	public void testCase2() {
		String m = "AGAREE 327485 ksjfmldsr";
		String actual = formatted_string(m);
		Assert.assertEquals(actual, "AAEEGRdfjklmrss  234578");
	}

}
