import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int find_hansu = input.nextInt();
    int count_hansu = 0;
    int result = 0;

    for (int i = 1; i < find_hansu + 1; i++) {
      result = interval(i);
      if (result == 5) {
        count_hansu++;
      }
    }

    System.out.println(count_hansu);

  }

  public static int interval(int num){
    String str_num = Integer.toString(num);

    if (str_num.length() == 1) {
      return 5;
    }

    int itv = (str_num.charAt(1) - '0') - (str_num.charAt(0) - '0');

    for (int j = 0; j < str_num.length() - 1; j++) {
      int tmp = (str_num.charAt(j+1) - '0') - (str_num.charAt(j) - '0');
      if (itv != tmp) {
        return 4;
      }
    }

    return 5;
  }
}
