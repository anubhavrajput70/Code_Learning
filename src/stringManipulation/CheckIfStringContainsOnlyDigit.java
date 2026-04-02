package stringManipulation;
//Input: "123a"
//Output: FALSE
public class CheckIfStringContainsOnlyDigit {
	static public void main(String[] args)
	{
		String str="123a";
		char[] ch =str.toCharArray();
		boolean flag=true;
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isLetter(ch[i]))
				flag=false;
		}
		System.out.println(flag);
	}
}
