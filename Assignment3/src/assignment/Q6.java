package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// WAP to sort a String Alphabetically
		//		vinaykumar
		//		aaikmnruvy

		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		char a[] = s.replaceAll("\\s", "").toLowerCase().toCharArray();
		Arrays.sort(a);
		System.out.println(new String(a));

	}

}
