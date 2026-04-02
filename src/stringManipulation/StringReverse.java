package stringManipulation;

//Input: "Selenium"
//Output: "muineleS"
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Selenium";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length / 2; i++) {
			char temp = ch[i];
			ch[i] = ch[ch.length - i - 1];
			ch[ch.length - i - 1] = temp;
		}
		System.out.println(new String(ch));

		StringBuilder st = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			st.append(str.charAt(i));
		}
		System.out.println(st);
	}
}
