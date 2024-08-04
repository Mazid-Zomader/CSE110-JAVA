import java.util.Scanner;
public class Ans_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.print("x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double slope = (y2-y1)/(x2-x1);
        System.out.format("Distance: %.4f", distance) ;
        System.out.format("\nSlope is: %.4f" , slope);
        if (slope > 0) {
            System.out.format("\nThe slope is Positive");
        }
        else {
            System.out.format("\nThe slope is Negative");
        }
    }
}
