package assignment;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// WAP to count number of special characters.
		// vinaykumar!@#$%^&*()
		// No. of special characters 10
		
		int count = 0;
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		char s1[] = s.replaceAll("\\s", "").toLowerCase().toCharArray();
		for (int i = 0; i < s1.length; i++) {
			if (!(s1[i] >= '0' && s1[i] <= '9') && !(s1[i] >= 97 && s1[i] <= 122)) {
				count++;

			}

		}
		System.out.println("No. of special characters " + count);

	}

}
