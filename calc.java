import java.util.Scanner;

public class Input {
   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      int term1, term2, sum;
      System.out.println("Skriv in två tal");
      term1 = sc.nextInt();
      term2 = sc.nextInt();
      sum = term1 + term2;
      System.out.println("Summan är");
      System.out.println(sum);
   }
}
