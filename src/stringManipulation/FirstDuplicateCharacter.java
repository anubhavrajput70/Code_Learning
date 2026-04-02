package stringManipulation;

import java.util.HashSet;
import java.util.Set;

//Input: "test"
//Output: t

public class FirstDuplicateCharacter {
	public static void main(String[] args) {
		String str = "testing";
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			if (!set.add(str.charAt(i))) {
				System.out.println(str.charAt(i));
				break;
			}
		}
	}

}
