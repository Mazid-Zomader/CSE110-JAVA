import java.util.Scanner ;
public class Assignment_03_02 {
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in) ;
    System.out.print("Enter Score: ") ;
    int score = sc.nextInt();
    if (score >= 90 ) 
    {
      System.out.print("Your grade is A");
    }
    else if (score >= 85 ) 
    {
      System.out.print("Your grade is A-");
    }
    else if (score >= 70) 
    {
      System.out.print("Your grade is B");
    }
    else if (score >= 57) 
    {
      System.out.print("Your grade is C");
    }
    else if (score >= 50 ) 
    {
      System.out.print("Your grade is D");
    }
    else 
    {
      System.out.print("Your grade is F");
    }
  }
} 