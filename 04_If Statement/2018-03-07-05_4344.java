import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] arr = new int[5][1001];
		double[] average = new double[10];
		int count = 0;
		
		int N = input.nextInt(); // input the number of test cases
				
		for(int i = 0; i < N; i++) {
			average[0] = 0;
			arr[0][0] = input.nextInt(); // input the number of students
			for(int j = 1; j < arr[0][0]+1; j++){
				arr[0][j] = input.nextInt(); // input data
				average[0] += (double) arr[0][j];
			}
			average[0] = average[0]/arr[0][0]; // calculate average of score
			
			count = 0;
			for(int j = 1; j < arr[0][0]+1; j++){
				if(average[0] < arr[0][j]){
					count++; // count the student whose score is over than average
				}
			}
			System.out.println(String.format("%.3f", (double) count/arr[0][0]*100)+"%"); // print
		}
	}
}
