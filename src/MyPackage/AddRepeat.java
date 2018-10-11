package MyPackage;

public class AddRepeat {
	public static void main(String args[]) {
		int sum;
		int[] num = { 2, 2, 4, 0, 8, 2 };
		for (int i = 0; i <= num.length - 1; i++) {
			for (int j = 0; j <= num.length - 1; j++) {
				if (i != j) {
					if (num[i] == num[j]) {
						sum = num[i] + num[j];
						num[i] = sum;
						num[j] = 0;
					}
				}
			}
			System.out.print(num[i] + " ");
		}
	}

}
