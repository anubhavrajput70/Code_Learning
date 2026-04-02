package stringManipulation;

import java.util.LinkedHashSet;
import java.util.Set;

//Input: "programming"
//Output: "progamin"
public class RemoveDuplicateCharacter {

	static public void main(String[] args)
	{
		String str="programming";
		Set<Character> set = new LinkedHashSet<>();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		StringBuilder st= new StringBuilder();
		for(Character ch:set)
		{
			st.append(ch);
		}
		System.out.println(st.toString());
	}
}
