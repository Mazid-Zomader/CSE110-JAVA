import java.util.Scanner ;
public class Assignment_04_03{
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    boolean flag = true ;
    while (flag) {
      System.out.print("Enter: ");
      int num = sc.nextInt();
      if (num >= 0) {
        int sq_num = num * num ;
        System.out.println(num+" ^ 2 "+" = "+sq_num);
      }
      else {
        flag = false ;
      }
      
    }
  }
}