import java.util.Scanner;
public class Ans_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int counter  ;
        int counter2 = 1;
        int sum = 0;
        for (counter = 3; counter2 <= n ; counter2++ ) {
            if (counter2 %2 != 0 ) {
                sum += counter;
            }
            else {
                sum -= counter;
            }
            counter += 2 ;
        }
        System.out.println(sum);
    }
}
