package assignment;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// WAP to check if the String is a Pangram or not.
		// The quick brown fox jumps over the lazy dog
		// Entered String is pangram
		// vinaykumar
		// Entered String is not a pangram
		boolean pangram = false;
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!(s.contains(String.valueOf(ch)))) {
				pangram = false;
				break;

			} else {
				pangram = true;
			}
		}
		if (pangram) {
			System.out.println("Entered String is pangram");
		} else {
			System.out.println("Entered String is not a pangram");
		}
	}

}
