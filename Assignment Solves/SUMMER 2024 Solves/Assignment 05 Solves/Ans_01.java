import java.util.Scanner;
public class Ans_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int counter = 0;
        boolean flag = true;
        int prime_check = 2 ;
        while (flag) {
            boolean isPrime = true;
            for (int i =2; i < prime_check; i++){
                if (prime_check % i == 0) {
                    isPrime = false;
                    break ;
                }
            }
            if (isPrime) {
                System.out.println(prime_check) ;
                counter += 1 ;
                if (counter == n) {
                    flag = false ;
                }
            }
            prime_check += 1 ;
        }
    }
}