package stringManipulation;
//Input: "Hello World"
//Output: "ello orld"
public class RemoveUpercaseFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		char[] ch = str.toCharArray();
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<ch.length;i++)
		{
			if(!Character.isUpperCase(ch[i]))
				sb.append(ch[i]);
		}
		System.out.println(sb.toString());
	}

}
