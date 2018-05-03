import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 0;
		int tmp = 0;
		String str = "";
		
		int number = input.nextInt(); // initial number
		int N = number; // temporary number
		
		while(true){
			if (N < 10) {
				tmp = N;
				
                // int -> string(N:lastnum + tmp:lastnum) -> int
				str = String.valueOf(N).charAt(0) + Integer.toString(tmp);
				tmp = Integer.parseInt(str);

								
			}
			else {
                // first number + second number
				tmp = (String.valueOf(N).charAt(0) - '0') + (String.valueOf(N).charAt(1) - '0');
				
				if(tmp < 10) {
                    // int -> string(N:lastnum + tmp:lastnum) -> int
					str = String.valueOf(N).charAt(1) + Integer.toString(tmp);
					tmp = Integer.parseInt(str);
				} else {
                    // int -> (N:lastnum + tmp:lastnum) -> int
					str = String.valueOf(String.valueOf(N).charAt(1)) + String.valueOf(String.valueOf(tmp).charAt(1));
					tmp = Integer.parseInt(str);
				}
								
			}
			
			count++; // increase of the number of times
			
			if(tmp == number)
				break;
			else{
				N = tmp;
				tmp = 0;
			}
			
		}
		
		System.out.println(count);
	}
}
