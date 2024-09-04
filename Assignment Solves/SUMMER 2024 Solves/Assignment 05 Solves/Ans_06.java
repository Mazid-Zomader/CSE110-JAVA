import java.util.Scanner;
public class Ans_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int k = 1 ;
            for(int j = n; j >= 1; j--) {
                if (i<j){
                    System.out.print("  ");
                }
                else{
                    System.out.print(k+" ") ;
                    k += 1 ;
                }
            }
            System.out.println();
        }
    }
}
