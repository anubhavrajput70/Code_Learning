package stringManipulation;
//
//Input: "apple"
//Output: p
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "apple";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
		}
		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			if (m.getValue() > 1) {
				System.out.println(m.getKey());
				break;
			}

		}

	}

}
