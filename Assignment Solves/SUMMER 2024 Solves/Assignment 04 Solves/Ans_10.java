import java.util.Scanner ;
public class Ans_10{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int num = sc.nextInt() ;
        int count = 0 ;
        int num1 = num ;
        while ( num != 0 ) {
            count += 1 ;
            num /= 10 ;
        }
//        System.out.print("Total digits = " +count);
        int power = (int) Math.pow(10, count-1) ;
        System.out.println(power) ;
        while (num1 != 0 && power != 0) {
            if (power == 1 ) {
                System.out.print(num1/power) ; break ;
            }
            System.out.print(num1/power+", ") ;
            num1 %= power ;
            power /= 10 ;
        }

    }
}