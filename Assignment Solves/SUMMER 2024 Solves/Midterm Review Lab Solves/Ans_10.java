import java.util.Scanner;
public class Ans_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ") ;
        int n = sc.nextInt();
        int count = 0 ;
        int num1 = n ;
        int decimal = 0 ;
        while ( n != 0 ) {
            count += 1 ;
            n /= 10 ;
        }
        int power = (int) Math.pow(10, count-1) ;
        count -= 1 ;
        while (num1 != 0 && power != 0) {
            if (power == 1 ) {
                decimal += (num1 / power) * Math.pow(2, count);
                break;
            }
            decimal += (num1/power)*Math.pow(2, count) ;
            num1 %= power ;
            power /= 10 ;
            count -= 1 ;
        }
        System.out.println(decimal) ;
    }
}
