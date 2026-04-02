package stringManipulation;
//Input: "Hello World"
//Output: "H W"
public class RemoveLoweCaseFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello World";
		char[] ch=str.toCharArray();
		StringBuilder sb= new StringBuilder();
		for(int i=0;i<ch.length;i++)
		{
			if(!Character.isLowerCase(ch[i]))
				sb.append(ch[i]);
		}
		System.out.println(sb.toString());
	}

}
