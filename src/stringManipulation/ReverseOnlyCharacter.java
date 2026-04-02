package stringManipulation;

public class ReverseOnlyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ab123cde";
		char[] ch = str.toCharArray();
		int i = 0, j = ch.length - 1;
		while (i < j) {
			if (Character.isDigit(ch[i]))
				i++;
			else if (Character.isDigit(ch[j]))
				j--;
			else {
				char c = ch[i];
				ch[i] = ch[j];
				ch[j] = c;
				i++;
				j--;
			}

		}
		System.out.println(new String(ch));

	}

}
