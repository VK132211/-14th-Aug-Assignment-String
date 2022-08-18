package assignment;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
//		WAP to reverse a sentence while preserving the position.
//		Input : “Think Twice”
//		Output : “kniht eciwt”
//		Think Twice
//		knihT eciwT 
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s2 = "";
		String s1[] = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			for (int j = s1[i].length() - 1; j >= 0; j--) {
				s2 = s2 + s1[i].charAt(j);

			}
			s2 += " ";
		}
		System.out.println(s2);

	}

}
