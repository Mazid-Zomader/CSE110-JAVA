import java.util.Scanner ;
public class Assignment_04_HW02{
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0 ;
    for (int i = 0 ; i< 10 ; i++) {
      System.out.print("Enter Number: ");
      int num = sc.nextInt();
      sum += num ;
      System.out.println("Sum = "+ sum);
    }
  }
}