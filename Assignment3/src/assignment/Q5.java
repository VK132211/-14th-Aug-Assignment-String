package assignment;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// WAP to print repeatedly occurring characters in the given String.

		//		NVIDIA GEFORCE GTX
		//		i
		//		g
		//		e

		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		char s1[] = s.replaceAll("\\s", "").toLowerCase().toCharArray();
		for (int i = 0; i < s1.length; i++) {
			for (int j = i + 1; j < s1.length; j++) {
				if (s1[i] == s1[j]) {
					System.out.println(s1[i]);

				}

			}
		}

	}

}
