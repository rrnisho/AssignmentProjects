package MyPackage;

import java.util.Scanner;

public class Larger {
	public static void main(String s[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = in.nextInt();
		System.out.println("Enter the value of b:");
		int b = in.nextInt();

		if (a >= (b + 2)) {
			System.out.println("a");
		} else if (b >= (a + 2)) {
			System.out.println("b");
		} else {
			System.out.println("INCONCLUSIVE");
		}
	}

}
