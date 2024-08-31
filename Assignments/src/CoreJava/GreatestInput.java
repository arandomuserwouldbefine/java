package CoreJava;

import java.util.Scanner;

public class GreatestInput {
	public static void main(String[] args) {
//		int vars
		int n1, n2, n3;
		
//		Take input from user
		Scanner sc = new Scanner(System.in);
//		Prompt user to add input
		System.out.println("Enter num 1: ");
		n1 = sc.nextInt();
		System.out.println("Enter num 2: ");
		n2 = sc.nextInt();
		System.out.println("Enter num 3: ");
		n3 = sc.nextInt();

		if (n1 > n2 && n1 > n3) {
//			n1 is greatest
			System.out.println("N1 is greatest");
		}
		
		else if(n2 > n3 && n2 > n1) {
//			n2 is greatest
			System.out.println("N2 is greatest");
		}
		else {
//			n3 is greatest
			System.out.println("N3 is greatest");
		}
	}
}
