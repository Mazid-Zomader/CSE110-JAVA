import java.util.Scanner;
public class Ans_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        System.out.print("Enter 1st number: ") ;
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ") ;
        int num2 = sc.nextInt() ;
        System.out.print("Enter operator: ") ;
        String operator = sc.next() ;
        if (operator.equals("+"))
        {
            System.out.println("Adding the two inputs you have taken");
            System.out.println(num1 + num2);
        }
        else if (operator.equals("-"))
        {
            System.out.println("Subtracting the two inputs you have taken");
            System.out.println(num1 - num2);
        }
        else  if (operator.equals("*"))
        {
            System.out.println("Multiplying the two inputs you have taken");
            System.out.println(num1 * num2);
        }
        else
        {
            System.out.println("Dividing the two inputs you have taken");
            System.out.println(num1 / num2);
        }
    }
}
