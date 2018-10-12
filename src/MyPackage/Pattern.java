package MyPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern {
	public static void main(String s[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the word: ");
		String word = br.readLine();
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(word.charAt(j) + " ");
			}
			System.out.println();
		}
		for (int i = word.length() - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(word.charAt(j) + " ");
			}
			System.out.println();
		}
	}
}
