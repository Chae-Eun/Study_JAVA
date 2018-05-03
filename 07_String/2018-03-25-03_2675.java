import java.sql.Array;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tc = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < tc; i++) {
			String[] str = input.nextLine().split(" ");
			for(int j = 0; j < str[1].length(); j++) {
				for(int j2 = 0; j2 < Integer.parseInt(str[0]); j2++) {
					System.out.print(str[1].charAt(j));
				}	
			}
			System.out.println("");
		}
    }
}
