package selectionSorting;

import java.util.Scanner;

public class sssd {

	public static void main(String[] args) {

		int n = 10;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("."); // soldaki noktalar
			}
			for (int j = n - i - 1; j < n - i; j++) {
				System.out.print("/"); //soldaki çizgi
			}

			for (int j = n - i; j < n + i; j++) {
				if (i == 0) {
					break;
				}
				if (i == n - 1) {
					System.out.print("_"); //taban çizgisi
				}

				else {
					System.out.print(" "); //içteki boþluklar (ilk ve son satýr dahil degil)

				}

			}

			for (int j = n - i; j < n - i + 1; j++) {
				System.out.print("\\"); //saðdaki çizgi
			}

			for (int j = n - i + 1; j < 2*n - 2 * i; j++) { //saðdaki noktalar
				System.out.print(".");

			}

			System.out.println();
		}

	}
}
