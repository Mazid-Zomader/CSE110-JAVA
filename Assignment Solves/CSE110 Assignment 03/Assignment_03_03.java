import java.util.Scanner ;
public class Assignment_03_03 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in) ;
    System.out.print("Enter Year: " ) ;
    int num = sc.nextInt() ;
    if ((num % 4 == 0 && num % 100 != 0) || num%400 == 0 )
    {
      System.out.print(num + " is a leap year");
    }
    else 
    {
      System.out.print(num + " is not a leap year");
    }
  }
}