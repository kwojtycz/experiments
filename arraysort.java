import java.util.Scanner;
import java.util.Arrays;

public class arraysort {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int integerAmount;
		int[] thisArray;
		
			print("Ile elementów chcesz posortowaæ?");
		integerAmount = scan.nextInt();
		
		arraysort arraysort = new arraysort();
		thisArray = arraysort.arrayInput(integerAmount);
			lineFeed();
			print("Podane liczby to:");
		for(int i =0; i <= integerAmount-1; i++) {
			System.out.println(thisArray[i]);
		}
			lineFeed();
		Arrays.sort(thisArray);
			print("Liczby posortowane rosn¹co to" );
		for(int i:thisArray) {
			System.out.println(i);
		}
			lineFeed();
			print("Liczby posortowane malej¹co to "  );
		for(int i =integerAmount-1; i>=0; i--) {
			System.out.println(thisArray[i]);
		}
	}
	
	static void print(String word) {
		System.out.println(word);	
	}
	
	int[] arrayInput(int integerAmount){
		Scanner sc = new Scanner(System.in);
		final int[] anArray = new int[integerAmount];
		for(int i =0; i <= integerAmount-1; i++) {
			System.out.println("Podaj liczbê "+i);
			anArray[i] = sc.nextInt();
		}
		return anArray;
	}
	static void lineFeed() {
		print("\n");
	}
}

