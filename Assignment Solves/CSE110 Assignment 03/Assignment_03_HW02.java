import java.util.Scanner ;
public class Assignment_03_HW02{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in) ;
    System.out.print("Enter number: ") ;
    int num = sc.nextInt();
    if ((num % 5 == 0) && (num % 7 == 0)) 
    {
      System.out.print("Divisible by both") ;
    } 
    else 
    {
      if (num % 7 == 0) 
      {
        System.out.print("Invalid: Divisible by 7 Only") ;
      }
      else if (num % 5 == 0 ) 
      {
        System.out.print("Invalid: Divisible by 5 Only") ;
      }
      else 
      {
        System.out.print("No") ;
      }
    }
  }
}