import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		Scanner userInput = new Scanner (System.in);
		String sad = ":-(";
		String happy = ":-)";
		
		String input = "";
		while(userInput.hasNext()){
			input += userInput.next();
			input += " ";
		}
		
		int sadValue = 0;
		int happyValue = 0;
		
		for(int x = 0; x < input.length(); x++){
			if(input.charAt(x) == sad.charAt(0))
				if(input.charAt(x+1) == sad.charAt(1))
					if(input.charAt(x+2) == sad.charAt(2))
						sadValue++;
					else if(input.charAt(x+2) == happy.charAt(2))
						happyValue++;
		}
		if (sadValue > happyValue)
			System.out.println("sad");
		else if (sadValue < happyValue)
			System.out.println("happy");
		else if (sadValue == 0)
			System.out.println("none");
		else System.out.println("unsure");
	}

}
