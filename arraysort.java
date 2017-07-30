import java.util.Scanner;
import java.util.Arrays;

public class arraysort {

	public static void main(String[] args) {
		
		// tworzy nowy obiekt nalezacy do klasy Scanner
		Scanner scan = new Scanner(System.in);
		// deklaruje liczbe calkowita oraz tablice liczb calkowitych
		int integerAmount;
		int[] thisArray;
		
			print("Ile elementów chcesz posortowac?");
		// pobiera liczbę z klawiatury
		integerAmount = scan.nextInt();
		
		arraysort arraysort = new arraysort();
		/*metoda arrayInput i tablica anArray nie są statyczne, nie można sie do nich odwoływać ze statycznej klasy main,
		tworzy obiekt należący do klasy arraysort, a następnie przyporzadkowuje wartość tablicy this Array tablicy 
		zwracanej przez funkcję arrayInput należącej do obiektu arraysort
		*/
		thisArray = arraysort.arrayInput(integerAmount);
		//line feed to wstawienei pustej linii
			lineFeed();
		
		// wyświetla podane liczby
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
		//inicjuje, deklaruje obiekt klasy Scanner
		Scanner sc = new Scanner(System.in);
		//deklaruje tablice liczb i rezerwuje dla niej miejsce w pamieci o wielkości integerAmount
		int[] anArray = new int[integerAmount];
		//pobiera kolejne elementy tablicy
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

