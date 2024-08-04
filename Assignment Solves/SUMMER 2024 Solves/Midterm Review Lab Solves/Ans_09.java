import java.util.Scanner ;
public class Ans_09{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int num = sc.nextInt() ;
        int count = 0 ;
        int num1 = num ;
        int sum = 0 ;
        while ( num != 0 ) {
            count += 1 ;
            num /= 10 ;
        }
        int power = (int) Math.pow(10, count-1) ;
        while (num1 != 0 && power != 0) {
            if (power == 1 ) {
                sum += num1/power ;
                break ;
            }
            sum += num1/power ;
            num1 %= power ;
            power /= 10 ;
        }
        if (sum %2 == 0 ) {
            System.out.println("The sum is even");
        }
        else {
            System.out.println("The sum is odd");
        }

    }
}
