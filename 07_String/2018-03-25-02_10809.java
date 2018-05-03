import java.sql.Array;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		int[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int count = 0;
		
		for (int i = 0; i < alphabet.length; i++) {
			count = 0;
			for (int j = 0; j < str.length(); j++) {
				if( alphabet[i] == str.charAt(j)) {
					count++;
					System.out.print(j+" ");
					break;
				}
			}
			if(count == 0) {
				System.out.print("-1 ");
			}
		}
    }
}
