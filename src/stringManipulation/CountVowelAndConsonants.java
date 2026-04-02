package stringManipulation;
//Input: "Automation in Java"

//Output: Vowels: 5, Consonants: 5

public class CountVowelAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Automation in Java";
		char[] ch = str.toCharArray();
		int vowel = 0, consonant = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				char c = Character.toLowerCase(ch[i]);
				if (c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u')
					vowel++;
				else
					consonant++;
			}
		}
		System.out.println(vowel + " " + consonant);
		vowel = 0;
		consonant = 0;
		for (int i = 0; i < ch.length; i++) {

			char c = Character.toLowerCase(ch[i]);
			if (Character.isLetter(c)) {
				if ("aioue".indexOf(c) != -1)
					vowel++;
				else
					consonant++;
			}

		}
		System.out.println(vowel + " " + consonant);
	}

}
