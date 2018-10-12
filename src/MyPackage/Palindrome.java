package MyPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the word: ");
		String word = br.readLine();
		String[] strarr = word.split(" ");
		for (int i = 0; i <= strarr.length-1; i++) {
			StringBuilder str = new StringBuilder(strarr[i]);
			String result = str.reverse().toString();
			if (!(strarr[i].equals(result))) {
				System.out.print(strarr[i]+" ");
			}
		}
	}
}
