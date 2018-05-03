import java.sql.Array;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		str = str.toUpperCase();
		char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int count = 0;
		int scount = 0;
		int dup = 0;
		char select = ' ';
		
		for(int i = 0; i < alphabet.length; i++) {
			count = 0;
			for(int j = 0; j < str.length(); j++) {
				if(alphabet[i] == str.charAt(j)) {
					count++;
				}
			}
			if (scount < count) {
				scount = count;
				select = alphabet[i];
				dup = 0;
			}
			else if (scount == count) {
				dup++;
			}
		}
		
		if(dup > 0) {
			System.out.println("?");
		}
		else {
			System.out.println(select);
		}	
    }
}
