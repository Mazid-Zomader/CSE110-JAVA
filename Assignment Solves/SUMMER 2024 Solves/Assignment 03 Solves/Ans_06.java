import java.util.Scanner ;
public class Ans_06 {
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