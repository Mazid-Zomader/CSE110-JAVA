import java.util.Scanner ;
public class Assignment_03_E02 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in) ;
    System.out.print("Enter number: ") ;
    int num = sc.nextInt() ;
    if (num < 0 ) 
    {
      System.out.print("Number is negative") ;
    }
    else if (num > 0) 
    {
      if (num % 2 == 0) 
      {
        System.out.print("Number is positive and even") ;
      }
      else 
      {
        System.out.print("Number is positive and odd");
      }
    }
    else 
    {
      System.out.print("Number is zero") ;
    }
  }
}