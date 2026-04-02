package stringManipulation;
//Input: " J a v a "
//Output: "Java"

public class RemoveAllSpaceFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" J a v a ";
		String res="";
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLetter(str.charAt(i)))
				res=res+str.charAt(i);
		}
		System.out.println(res);

	}

}
