package MyPackage;

public class SmallestGreater {
	public static void main(String args[]) {
		int a[] = { 6, 3, 9, 8, 10, 2, 1, 15, 7 };
		for (int i = 0; i < a.length; i++) {
			int d = 1000;
			int result = -1;
			for (int j = 0; j < a.length; j++) {
				if (i != j) {
					if (a[i] < a[j] && a[j] - a[i] < d) {
						d = a[j] - a[i];
						result = j;
					}
				}

			}
			if (result == -1) {
				System.out.println("_");
			} else
				System.out.println(a[i] + "->" + a[result]);
		}
	}
}
