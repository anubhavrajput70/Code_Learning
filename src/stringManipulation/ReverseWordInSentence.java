package stringManipulation;

//
//Input: "Hello World"
//Output: "olleH dlroW"
public class ReverseWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		String[] st = str.split(" ");
		String res = "";
		for (int i = 0; i < st.length; i++) {
			res = res + rev(st[i]) + " ";
		}
		System.out.println(res);
	}

	public static String rev(String s) {
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			res = s.charAt(i) + res;
		}
		return res;
	}

}
