import java.util.Scanner ;
public class Assignment_03_HW03{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number: ");
    int num = sc.nextInt();
    if (num < 0) {
      System.out.print("Output: "+ 2*num);
    }
    else if (num < 2) {
      int ans = num + 1;
      System.out.print("Output: " + ans) ;
    }
    else if (num < 5 ) 
    {
      int ans = (num * num) -1  ;
      System.out.print("Output: " + ans);
    }
    else 
    {
      int ans = 3* (num * num ) +2 ;
      System.out.print("Output: "+ ans) ;
    }
  }
}