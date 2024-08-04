import java.util.Scanner;
public class Ans_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.print("output: ");
        if (n < 0 ) {
            System.out.println(2*n);
        }
        else if ( n >= 0 && n < 2) {
            System.out.println(n+1);
        }
        else if (n >= 2 && n < 5) {
            System.out.println((int)Math.pow(n, 2)-1) ;
        }
        else {
            System.out.println((int)(3 *Math.pow(n, 2))+2);
        }
    }
}
