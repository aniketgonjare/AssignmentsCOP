//Printing K Pattern

public class K_Pattern {
	public static void main(String[] args) {
		int n = 5, count = 0;
		for (int i = 0; i < n; i++) {

			count = 0;
			for (int j = i; j < n; j++) {
				count++;
				if (j == i || j == (n - 1))
					System.out.print("* ");
				else {
					System.out.print("  ");
				}

			}

			System.out.println();

			if (count == 2)
				break;

		}

		for (int i = 0; i < n; i++) {
			for (int k = 0; k <= i + 1; k++) {
			}
			for (int j = 1; j <= i + 1; j++) {
				if (j == 1 || j == (i + 1))
					System.out.print("* ");
				else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}

}
