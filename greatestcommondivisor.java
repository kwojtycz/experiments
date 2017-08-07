import java.util.Scanner;

public class greatestcommondivisor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double firstinputNumber, secondinputNumber, higherNumber, lowerNumber;
		double divisingResult;
		
		print("Niniejszy program oblicza najwiêkszy wspolny dzielnik dwoch liczb");
		print("Podaj pierwsza liczbe");
		firstinputNumber = input.nextInt();
		print("Podaj drug¹ liczbe");
		secondinputNumber =input.nextInt();
		if(firstinputNumber>=secondinputNumber) {
			higherNumber = firstinputNumber;
			lowerNumber = secondinputNumber; 
		}else {
			higherNumber = secondinputNumber; 
			lowerNumber = firstinputNumber; 
		}
		do{
			divisingResult =divising(higherNumber,lowerNumber);
			higherNumber = higherorLower(divisingResult,higherNumber,lowerNumber);
			lowerNumber = lowerordivisingResult(divisingResult, lowerNumber);
		}while(divisingResult != 0);
		
		System.out.println("Wynik to "+lowerNumber);
	}
	public static void print(String word) {
		System.out.println(word);
	}
	
	public static double divising(double higherNumber, double lowerNumber ){
		double divisingRest;
		divisingRest=higherNumber%lowerNumber;
			return divisingRest;
		}
	
	public static double higherorLower(double divisingResult, double higherNumber, double lowerNumber) {
		if(divisingResult == 0 ) {
			return higherNumber;
		}else {
			return lowerNumber;
		}
		
	}
	public static double lowerordivisingResult(double divisingResult, double lowerNumber) {
		if (divisingResult == 0) {
			return lowerNumber;
		}else {
			return divisingResult;
		}
	}
}


