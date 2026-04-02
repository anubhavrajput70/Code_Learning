package stringManipulation;

//
//Input: "I like Tea", "Tea", "Java"
//Output: "I like Java"
public class ReplaceWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I like Tea";
		String rep = "Tea";
		String to = "Java";
		String[] st = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < st.length; i++) {
			if (st[i].equals(rep))
				st[i] = to;
			sb.append(st[i]);
			if (i != st.length - 1)
				sb.append(" ");
		}
		System.out.println(sb.toString());
	}
}
