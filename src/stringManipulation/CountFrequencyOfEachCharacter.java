package stringManipulation;

import java.util.HashMap;
import java.util.Map;

//
//Input: "aabbc"
//Output: {a:2, b:2, c:1}
public class CountFrequencyOfEachCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="aabbc";
		Map<Character,Integer> map= new HashMap<>();
		for(int i=0;i<str.length();i++)
		{
			map.put(str.charAt(i),map.getOrDefault(str.charAt(i), 0)+1);
		}
		for(Map.Entry<Character,Integer> m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
