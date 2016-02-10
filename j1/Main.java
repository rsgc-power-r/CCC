import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		Scanner userInput = new Scanner (System.in);
		
		int month = userInput.nextInt();
		
		int day = userInput.nextInt();

		if (month > 2)
			System.out.println("After");
		else if (month < 2)
			System.out.println("Before");
		else if (day > 18)
			System.out.println("After");
		else if (day < 18)
			System.out.println("Before");
		else System.out.println("Special");	
	}

}
