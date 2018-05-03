import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		int count = 1;
		int result_num = 0;
		int value = 0;
		ArrayList<Integer> num_list = new ArrayList<>();

		for(int i = 0; i < 9973; i++){
			result_num = self_number(count);
			num_list.add(result_num);
			count ++;
		}

		for(int j = 1; j <= 10000; j++){
			if(num_list.contains(j) == false){
				System.out.println(j);
			}
		}
	}

	public static int self_number(int num){
		String str_num = Integer.toString(num);
		int result = 0;

		for(int i = 0; i < str_num.length(); i++) {
			result = result + (str_num.charAt(i) - '0');
		}

		result = result + num;

		return result;
	}
}
