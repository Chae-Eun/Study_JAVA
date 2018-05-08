import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b;
    String str_a, str_b;

    do {
      a = input.nextInt();
      str_a = String.valueOf(a);
    } while (str_a.contains("0") || str_a.length() != 3);

    do {
      b = input.nextInt();
      str_b = String.valueOf(b);
    } while (str_b.contains("0") || str_b.length() != 3);


    for(int i = 2; i >= 0; i--) {
      if(str_a.charAt(i) == str_b.charAt(i)) {
        continue;
      }
      else{
        if(str_a.charAt(i) > str_b.charAt(i)) {
          System.out.print(str_a.charAt(2));
          System.out.print(str_a.charAt(1));
          System.out.println(str_a.charAt(0));
          break;
        }
        else {
          System.out.print(str_b.charAt(2));
          System.out.print(str_b.charAt(1));
          System.out.println(str_b.charAt(0));
          break;
        }
      }
    }
  }
}
