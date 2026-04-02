package stringManipulation;
//Input: "Java is Fun"

//Output: "Fun is Java"

public class ReverseOrderOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Java is Fun";
		String[] st = str.split(" ");
		for (int i = 0; i < st.length / 2; i++) {
			String s = st[i];
			st[i] = st[st.length - i - 1];
			st[st.length - i - 1] = s;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < st.length; i++) {
			sb.append(st[i]);
			if (i != st.length - 1)
				sb.append(" ");
		}
		System.out.println(sb.toString());

	}

}
