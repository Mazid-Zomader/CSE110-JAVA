import java.util.Scanner;
public class Ans_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        double counter = 1.0 ;
        double sum = 0;
        while (counter <= n) {
            if (counter % 4 == 0) {
                sum -= 1/counter ;
            }
            else {
                sum += 1/counter ;
            }
            counter+=1;
        }
        System.out.format("Y = %.4f",sum);
    }
}
