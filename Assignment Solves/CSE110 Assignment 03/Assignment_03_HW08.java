import java.util.Scanner ;
public class Assignment_03_HW08 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Input the 1st number:");
    int num1 = sc.nextInt() ;
    System.out.print("Input the 2nd number:");
    int num2 = sc.nextInt() ;
    System.out.print("Input the 3rd number:");
    int num3 = sc.nextInt() ;
    if (num1 == num2 && num2 == num3 ) {
      System.out.print("All numbers are equal");
    }
    else if (num1 != num2 && num2 != num3 ) {
      System.out.print("All numbers are different");
    }
    else {
      System.out.print("Neither all equal or different");
    }
  }
}