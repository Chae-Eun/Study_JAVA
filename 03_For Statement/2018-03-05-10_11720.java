import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		input.nextLine();
		String str = input.nextLine();
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			sum += (str.charAt(i) - '0');
		}
		
		System.out.print(sum);
	}
}
