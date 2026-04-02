package stringManipulation;
//Input: "Cloud", 'u'
//Output: "Clod"
public class RemoveSpecificCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Cloud";
		char ch='u';
		char chr[]=str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<chr.length;i++)
		{
			if(chr[i]!=ch)
			{
				sb.append(chr[i]);
			}
		}
		System.out.println(sb.toString());

	}

}
