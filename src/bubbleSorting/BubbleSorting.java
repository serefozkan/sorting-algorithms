package bubbleSorting;

public class BubbleSorting {

	public static void main(String[] args) {

		int list []= {11,16,8,7,20,4,14};
		int n=list.length-1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				if(list[j+1]<list[j]) {
					int temp=list[j+1];
					list[j+1]=list[j];
					list[j]=temp;
				}
			
			}
		}
	
		for (int x : list) {
			System.out.print(x +" ");
		}
		
	}

}
