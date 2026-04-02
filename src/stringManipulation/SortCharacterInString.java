package stringManipulation;

import java.util.Arrays;

//Input: "rock"
//Output: "ckor"
public class SortCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="rock";
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		String st=new String(ch);
		System.out.println(st);
		
	}

}
