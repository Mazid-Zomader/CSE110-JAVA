import java.util.Scanner;
public class Ans_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of A: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of B: ");
        double b = sc.nextDouble();
        System.out.print("Enter value of C: ");
        double c = sc.nextDouble();
        double roots = Math.pow(b, 2) - 4*a*c ;
        if (roots < 0 || a == 0) {
            System.out.println("Impossible to calculate");
        }
        else {
            double root1 = (-b+Math.sqrt(roots))/(2*a);
            System.out.format("Root#1= %.5f",root1);
            double root2 = (-b-Math.sqrt(roots))/(2*a);
            System.out.format("\nRoot#2= %.5f",root2);
        }
    }
}
