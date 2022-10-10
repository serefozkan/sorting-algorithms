package selectionSorting;

public class SelectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int liste []= {2,7,4,1,5,3};
		for (int i = 0; i < liste.length-1; i++) {
			int min=i; //her üste geldiginde min tekrardan i++ gibi yenilenecek.
		for (int j = min+1; j < liste.length; j++) {
			if(liste[j]<liste[min]) {
				min=j;
			}
		}
		swap(min,i,liste);//min kullanma nedenim j yi parantez dýsýnda kullanamamam. tüm sayýlarý kontrol etmeli j yi alýrsam etmez.
		}
		
		for (int i : liste) {
			System.out.print(i+" ");
		}
	}//1 7 4 2 5 3

	private static void swap(int min, int i, int[] liste) {
			int temp=liste[min];
			liste[min]=liste[i];
			liste[i]=temp;
			}
}
