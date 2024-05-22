import java.util.Scanner ;
public class Assignment_04_E01{
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Sample Input: ");
    int num = sc.nextInt();
    System.out.println("Divisor of "+ num);
    for (int i = 1 ; i <= num ; i++) {
      if (num % i == 0 ) {
        System.out.println(i);
      }
    }
  }
}