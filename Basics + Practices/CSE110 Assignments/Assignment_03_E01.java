import java.util.Scanner ;
public class Assignment_03_E01 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in) ;
    System.out.print("Enter 1st number: ") ;
    int num1 = sc.nextInt() ;
    System.out.print("Enter 2nd number: ") ;
    int num2 = sc.nextInt() ;
    System.out.print("Enter 3rd number: ") ;
    int num3 = sc.nextInt() ;
    if (num1 < num2  && num3 > num1) 
    {
      System.out.print("Smallest number: "+ num1) ;
    }
    else if (num2 < num3 && num2 < num1) 
    {
      System.out.print("Smallest number: "+ num2) ;
    }
    else 
    {
      System.out.print("Smallest number: "+ num3) ;
    }
  }
}