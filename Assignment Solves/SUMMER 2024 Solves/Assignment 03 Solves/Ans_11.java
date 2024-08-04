import java.util.Scanner ;
public class Ans_11 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter 1st number: ") ;
        int num1 = sc.nextInt() ;
        System.out.print("Enter 2nd number: ") ;
        int num2 = sc.nextInt() ;
        System.out.print("Enter 3rd number: ") ;
        int num3 = sc.nextInt() ;
        if (num1 == num2 && num2== num3)
        {
            System.out.print("This is a Equilateral triangle");
        }
        else if (num1 != num2 && num2 != num3 )
        {
            System.out.print("This is a Scalene triangle");
        }
        else
        {
            System.out.print("This is a Isosceles triangle");
        }
    }
}