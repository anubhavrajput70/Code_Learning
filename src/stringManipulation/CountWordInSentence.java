package stringManipulation;

//Input: "Keep it simple"
//Output: 3
public class CountWordInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Keep it simple";
		String st[]=str.trim().split("\\s+");
		System.out.println(st.length);
	}

}
