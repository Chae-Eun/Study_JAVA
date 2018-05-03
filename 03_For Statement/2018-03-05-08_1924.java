import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] cal = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int m = input.nextInt();
		int d = input.nextInt();
		
		if(m != 1) {
			for(int i = 0; i < m - 1; i++) {
				d += cal[i];
			}
		}
		
		switch(d%7){
			case 1:
				System.out.print("MON");
				break;
			case 2:
				System.out.print("TUE");
				break;
			case 3:
				System.out.print("WED");
				break;
			case 4:
				System.out.print("THU");
				break;
			case 5:
				System.out.print("FRI");
				break;
			case 6:
				System.out.print("SAT");
				break;
			case 0:
				System.out.print("SUN");
				break;
		}
	}
}
