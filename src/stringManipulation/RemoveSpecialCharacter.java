package stringManipulation;

//Input: "Hi! @Home"
//Output: "Hi Home"
public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hi! @Home";
		String st = str.replaceAll("[^a-zA-Z ]", "");
		System.out.println(st);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)) || str.charAt(i) == ' ') {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.toString());

	}

}
