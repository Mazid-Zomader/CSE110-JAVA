import java.util.Scanner ;
public class Assignment_03_HW07 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in) ;
    System.out.println("Enter the amount the customer need to pay(Taka)") ;
    int num1 = sc.nextInt() ;
    System.out.println("Enter the amount, customer gave(Taka)") ;
    int num2 = sc.nextInt() ;
    int return_amount = num2 - num1;
    if (return_amount < 0 ) 
    {
      int mod_val = Math.abs(return_amount) ;
      System.out.print("Please pay "+ mod_val + " taka more");
    }
    else if (return_amount == 0 ) 
    {
      System.out.print("The returned amount is 0 taka") ;
    }
    else 
    {
      System.out.println("The returned amount is " + return_amount +" taka");
      int tk_100 = return_amount / 100 ;
      System.out.println("100 taka note: "+tk_100);
      return_amount %= 100 ;
      int tk_50 = return_amount / 50 ;
      System.out.println("50 taka note: "+tk_50);
      return_amount %= 50 ;
      int tk_20 = return_amount / 20 ;
      System.out.println("20 taka note: "+tk_20);
      return_amount  %= 20 ;
      int tk_10 = return_amount / 10 ;
      System.out.println("10 taka note: "+tk_10);
      return_amount %= 10 ;
      int tk_5 = return_amount / 5 ;
      System.out.println("5 taka coin: "+tk_5);
      return_amount %= 5 ;
      int tk_2 = return_amount / 2 ;
      System.out.println("2 taka coin: "+tk_2);
      return_amount %= 2 ;
      int tk_1 = return_amount ;
      System.out.println("1 taka note: "+tk_1);
    }
    
  }
}