import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		//System.out.println("N : "+N);
		int[] a = new int[N*2];
		//System.out.println("a.length : " + a.length);
		
		for(int i = 0; i < N*2; i += 2){
		    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		        
			a[i] = Integer.parseInt(st.nextToken());
			a[i+1] = Integer.parseInt(st.nextToken());
		}
		
		for(int j = 0; j < N*2; j += 2){
			bw.write(String.valueOf(a[j]+a[j+1]));
			bw.newLine();
		}
		
		bw.flush();
		
	}
}
