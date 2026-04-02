package stringManipulation;

import java.util.HashSet;
import java.util.Set;

//Input: "thin", "thick"
//Output: "t, h, i"
public class CommonCharacterBetweenTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="thin",st="thick";
		Set<Character> set= new HashSet<>();
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for(int i=0;i<st.length();i++)
		{
			if(set.contains(st.charAt(i)))
					{
				System.out.println(st.charAt(i));
					}
		}
	}

}
