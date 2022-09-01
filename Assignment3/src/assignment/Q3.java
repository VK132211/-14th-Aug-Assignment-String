package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// WAP to check if the String is Anagram or not.
		//		Vinay Kumar
		//		Yaniv Ramuk
		//		Entered two strings are anagram

		//		Virat Kohli
		//		Virat
		//		Entered two strings are not anagrams

		Scanner sc = new Scanner(System.in);
		String s1, s2, s3, s4;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = s1.replaceAll("\\s", "");
		s4 = s2.replaceAll("\\s", "");
		boolean s = true;
		if (s3.length() != s4.length()) {
			s = false;
		} else {
			char A1[] = s3.toLowerCase().toCharArray();
			char A2[] = s4.toLowerCase().toCharArray();
			Arrays.sort(A1);
			Arrays.sort(A2);
			s = Arrays.equals(A1, A2);

		}
		if (s) {
			System.out.println("Entered two strings are anagram");
		} else {
			System.out.println("Entered two strings are not anagrams");
		}

	}

}
