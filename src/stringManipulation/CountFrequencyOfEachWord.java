package stringManipulation;

import java.util.HashMap;
import java.util.Map;

//Input: "cat dog cat"
//Output: {cat:2, dog:1}
public class CountFrequencyOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="cat dog cat";
		String[] st=str.split(" ");
		Map<String,Integer> map=new HashMap<>();
		for(int i=0;i<st.length;i++) {
			map.put(st[i],map.getOrDefault(st[i], 0)+1);
		}
		for(Map.Entry<String,Integer> m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
