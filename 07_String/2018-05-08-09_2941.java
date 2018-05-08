import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] croa = {"c-", "c=", "dz=", "d-", "lj", "nj", "s=", "z="};
    String str = input.nextLine();
    String str2 = str;
    int count = 0;

    for(int i = 0; i < croa.length; i++){
      if(str.contains(croa[i]) == true){
        count += Counting(str, croa[i]);
        str2 = str2.replace(croa[i], "");
      }
    }

    count += str2.length();

    System.out.println(count);
  }

  public static int Counting(String str, String word){
    int count = 0;
    int p1, p2;

    if(word == "z=")
      str = str.replaceFirst("dz=", "");

    while(str.contains(word) == true){
      p1 = str.indexOf(word);

      str = str.replaceFirst(word, "");
      p2 = str.indexOf(word);

      count++;

      if(p2 < p1)
        break;
    }

    return count;
  }
}
