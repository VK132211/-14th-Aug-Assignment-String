package assignment;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// WAP to count the number of Vowels and Consonants of a String value.
		// vinaykumar
		// No. of vowels 4
		// No. of consonants 6
		
		String s;
		int vowel_count = 0;
		int consonant_count = 0;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		char s1[] = s.replaceAll("\\s", "").toLowerCase().toCharArray();
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] == 'a' || s1[i] == 'e' || s1[i] == 'i' || s1[i] == 'o' || s1[i] == 'u') {
				vowel_count++;
			} else if (!(s1[i] >= '0' && s1[i] <= '9')) {
				consonant_count++;
			}
		}
		System.out.println("No. of vowels " + vowel_count);
		System.out.println("No. of consonants " + consonant_count);
	}

}
