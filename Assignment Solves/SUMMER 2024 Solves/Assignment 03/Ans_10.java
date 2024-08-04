import java.util.Scanner ;
public class Ans_10 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter 1st number: ") ;
        float num1 = sc.nextFloat() ;
        System.out.print("Enter 2nd number: ") ;
        float num2 = sc.nextFloat() ;
        System.out.print("Enter 3rd number: ") ;
        float num3 = sc.nextFloat() ;
        if (num1 > num2  && num2 > num3)
        {
            System.out.println("Maximum number: "+ num1) ;
            System.out.print("Minimum number: "+ num3) ;
        }
        else if (num3 > num1 && num1 > num2)
        {
            System.out.println("Maximum number: "+ num3) ;
            System.out.print("Minimum number: "+ num2) ;
        }
        else if ((num1>num3) && (num3> num2 ))
        {
            System.out.println("Maximum number: "+ num1) ;
            System.out.print("Minimum number: "+ num2) ;
        }
        else if ((num2>num3) && (num3> num1) )
        {
            System.out.println("Maximum number: "+ num2) ;
            System.out.print("Minimum number: "+ num1) ;
        }
        else if ((num3>num2) && (num2> num1) )
        {
            System.out.println("Maximum number: "+ num3) ;
            System.out.print("Minimum number: "+ num1) ;
        }
        else if ((num2>num1) && (num1> num3) )
        {
            System.out.println("Maximum number: "+ num2) ;
            System.out.print("Minimum number: "+ num3) ;
        }
    }
}