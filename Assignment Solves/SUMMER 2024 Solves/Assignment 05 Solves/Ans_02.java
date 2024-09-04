import java.util.Scanner;
public class Ans_E01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The value of N: ");
        int n = sc.nextInt();
        int counter = 1;
        int final_sum = 0 ;
        while (counter <= n) {
            int sum = 0 ;
            for (int i = 1; i <= counter; i++) {
                sum += i ;
            }
            final_sum -= sum ;
            counter += 1 ;
        }
        System.out.println("The value of y: "+final_sum);
    }
}
