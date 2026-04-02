package stringManipulation;

//
//Input: "I love Java coding"
//Output: "I love avaJ coding"
public class ReverseThirdWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I love Java coding";
		String[] arr = str.split(" ");
		StringBuilder st = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (i == 2) {
				st.append(rev(arr[i]));
			} else {
				st.append(arr[i]);
			}
			if (i != arr.length - 1) {
				st.append(" ");
			}
		}
		System.out.println(st.toString());

	}

	public static String rev(String s) {
		StringBuilder st = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			st.append(s.charAt(i));
		}
		return st.toString();
	}
}
