package insertionSorting;

public class InstertionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//worst case o(n2) tersine sirali
//best case o(n) sirali
//average case  o(n2)		

		int[] a = { 16, 11, 7, 8, 20, 4, 14 };
		for (int i = 1; i < a.length; i++) {
			int number = a[i]; // belirtecin sagi
			int j = i - 1; // belirtecin solu icin degisken(azalan) indis.
				while (j >= 0 && a[j] > number) {
					a[j + 1] = a[j];
					j--;
				}
				a[j + 1] = number;
		}
		for (int x : a) {
			System.out.print(x + " ");
		}

	}
}