package MyPackage;

public class AddRepeat {
	public static void main(String args[]) {
		int sum;
		int[] num = { 2, 2, 0, 4, 0, 2 };
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

		}
		for (int i = num.length-1;i> 0; i--) {
			for (int j = i - 1; j > 0; j--) {
				if (num[i] != 0) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		for (int i = 0; i <= num.length-1; i++)
			System.out.print(num[i]+" ");
	}

}
