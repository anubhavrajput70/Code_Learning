package stringManipulation;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabcbb";
		Set<Character> set = new HashSet<>();
		int max = 0, j = 0,start=0;
		for (int i = 0; i < str.length(); i++) {
			while (set.contains(str.charAt(i))) {
				set.remove(str.charAt(j));
				j++;
			}
			set.add(str.charAt(i));
			if(max<i-j+1)
			{
				max=i-j+1;
				start=j;
			}
		}
		System.out.println(max);
		System.out.println(str.substring(start, start + max));
		
	}

}
