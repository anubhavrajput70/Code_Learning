package stringManipulation;
//Input: "apple", 'p', 'z'

//Output: "azzle"

public class ReplaceCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "apple";
		char st = 'p';
		char rep = 'z';
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == st)
				sb.append(rep);
			else
				sb.append(str.charAt(i));
		}
		System.out.println(sb.toString());
	}

}
