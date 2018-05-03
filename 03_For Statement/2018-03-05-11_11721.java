import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			if((i % 10 == 0)&&(i != 0))
				System.out.println("");
			System.out.print(str.charAt(i));
		}	
   }
}
