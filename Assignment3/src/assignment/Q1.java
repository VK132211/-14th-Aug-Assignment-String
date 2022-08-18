package assignment;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
//		WAP to reverse a String.
//		Input: “iNeuron”
//		Output: “norueNi”
//		iNeuron
//		norueNi
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.nextLine());
		sb.reverse();
		System.out.println(sb);
	}

}
