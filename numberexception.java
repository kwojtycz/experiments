

import java.util.Scanner;
public class numberexception {

	public static void main(String[] args) {
		String[] anArray;
		String answer;
		int wordAmount;
		Scanner scan = new Scanner(System.in);
		numberexception numberexception = new numberexception();
		/*zmienna zadeklarowana w ciele metody main, to nie ta sama 
		 * zmienna co będąca wynikiem metody */
		
		do{
			print("Ile słów chcesz wpisać?");
		answer = scan.next();
		numberexception.tryParseInt(answer);
		
			if(numberexception.tryParseInt(answer)){
				print("Podałeś wartość liczbową");
			} else{
				print("Nie podałeś wartości liczbowej");
			}
		}while(!numberexception.tryParseInt(answer));
		
			wordAmount = numberexception.parseInt(answer);
			anArray = new String[wordAmount];
			
		for(int i =0; i<=wordAmount-1;i++){
			System.out.println("Podaj słowo "+i);
			anArray[i]=scan.next();
		}
			print("Podane liczby to ");
		for(int i =0; i <=wordAmount-1; i++){
			System.out.println(anArray[i]);
		}
	}

	boolean tryParseInt(String string) { 
	     try {  
	         Integer.parseInt(string);
	         return true;
	      } catch (NumberFormatException e) {
	         return false;  
	      }
		}

	int parseInt(String string){
		return Integer.parseInt(string);
	}

	static void print(String string){
		System.out.println(string);
}


}

