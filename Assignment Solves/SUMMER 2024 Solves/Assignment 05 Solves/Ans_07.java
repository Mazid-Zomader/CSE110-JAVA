import java.util.Scanner;
public class Ans_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int odd = 1 ;
        int j = 1 ;

        while (j <= n) {
            int i = 1 ;
            for (int k = 1 ; k <= n-j; k++){
                System.out.print("  ");
            }
            while (i<= odd) {
                System.out.print(i+" ");
                i+= 1 ;
            }
            for (int k = 1 ; k <= n-j; k++){
                System.out.print("  " );
            }
            odd += 2 ;
            System.out.println();
            j+= 1 ;
        }
    }
}
