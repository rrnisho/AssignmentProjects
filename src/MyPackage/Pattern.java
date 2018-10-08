package MyPackage;

public class Pattern {
	public static void main(String s[]) {
		String word="JAVAJ2EE";
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(word.charAt(j));
			}
			System.out.println();
		}
		for (int i = word.length(); i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(word.charAt(j));
			}
			System.out.println();
		}
	}
}
