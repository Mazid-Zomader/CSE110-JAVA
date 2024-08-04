import java.util.Scanner;
public class Ans_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        if (n / 2 == 0) {
            System.out.print(n);
        }
        else {
            System.out.print(n+", ");
            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                    if (n / 2 == 0) {
                        System.out.print(n);
                    } else {
                        System.out.print(n + ", ");
                    }
                } else {
                    if (n / 2 == 0) {
                        System.out.print(n);
                    } else {
                        n = n * 3 + 1;
                        System.out.print(n + ", ");
                    }
                }
            }
        }
    }
}
