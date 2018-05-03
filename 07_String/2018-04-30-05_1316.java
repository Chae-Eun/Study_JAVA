import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    int count = 0;
    input.nextLine(); // delete blank
    String str = "";
    String cmp = "";
    char c = ' ';

    for(int i = 0; i < N; i++) {
      str = input.nextLine();
      str = str.toLowerCase();
      cmp = "";

      for(int j = 0; j < str.length(); j++){
        c = str.charAt(j);

        if(cmp == ""){
          cmp = cmp + c;
        }
        else{
          if(cmp.indexOf(c) > -1){ // if alphabet exists
              if(cmp.indexOf(c) != cmp.length() -1){
                  break;
              }
          }
          else{ // if alphabet does not exists
              cmp = cmp + c;
          }
        }

        if(j == str.length() -1)
          count++;
      }
    }

    System.out.println(count);
  }
}
