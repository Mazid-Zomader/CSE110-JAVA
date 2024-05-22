import java.util.Scanner ;
public class Assignment_03_HW05 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in) ;
    System.out.print("Enter salary: ") ;
    int salary = sc.nextInt() ;
    System.out.print("Enter age: ") ;
    int age = sc.nextInt() ;
    if (age < 18) 
    {
      System.out.print("Your tax amounts is 0 Tk") ;
    }
    else 
    {
      if (salary < 10000) 
      {
        System.out.print("Your tax amounts is 0 Tk");
      }
      else if (salary < 20000) 
      {
        double tax = salary*0.05 ;
        int mod_tax = (int) tax;
        System.out.print("Your tax amount is "+mod_tax+" Tk") ;
      }
      else 
      {
        double tax = salary*0.1 ;
        int mod_tax = (int) tax;
        System.out.print("Your tax amount is "+mod_tax+" Tk") ;
      }
    }
  }
}