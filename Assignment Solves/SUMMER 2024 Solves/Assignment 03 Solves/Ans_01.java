import java.util.Scanner;
public class Ans_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: "); int n = sc.nextInt();
        System.out.print("Enter an integer: "); int m = sc.nextInt();
        System.out.print("Enter an integer: "); int d = sc.nextInt();
        if (n > m && n > d) {
            System.out.println("Largest number: "+ n);
        }
        else if (m > n && m > d) {
            System.out.println("Largest number: "+ m);
        }
        else {
            System.out.println("Largest number: "+ d);
        }
    }
}
