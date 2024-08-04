import java.util.Scanner;
public class Ans_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        if (n >= 90) {
            System.out.print("Your grade is A");
        }
        else if (n >= 85) {
            System.out.print("Your grade is A-");
        }
        else if (n >= 70) {
            System.out.print("Your grade is B");
        }
        else if (n >= 57) {
            System.out.print("Your grade is C");
        }
        else if (n >= 50) {
            System.out.print("Your grade is D");
        }
        else {
            System.out.print("Your grade is F");
        }
    }
}
