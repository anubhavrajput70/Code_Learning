package stringManipulation;

//Input: "Java123"
//Output: "Java"
public class RemoveDigitFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java124";
		StringBuilder st=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(str.charAt(i)))
			{
				st.append(str.charAt(i));
			}
		}
		System.out.println(st.toString());
	}

}
