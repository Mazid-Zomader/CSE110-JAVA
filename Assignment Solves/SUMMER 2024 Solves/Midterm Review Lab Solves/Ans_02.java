import java.util.Scanner;
public class Ans_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Item code: ");
        int n = sc.nextInt();
        System.out.print("Item amount: ");
        int m = sc.nextInt();
        if (n == 1) {
            System.out.println("Item: Hot dog");
            System.out.println("Quantity: "+m);
            System.out.format("Total: $%.2f",4.00*m);
        }
        else if (n == 2) {
            System.out.println("Item: X-Salad");
            System.out.println("Quantity: "+m);
            System.out.format("Total: $%.2f",4.50*m);
        }
        else if (n == 3) {
            System.out.println("Item: X-Bacon");
            System.out.println("Quantity: "+m);
            System.out.format("Total: $%.2f",5.00*m);
        }
        else if (n == 4) {
            System.out.println("Item: Toast");
            System.out.println("Quantity: "+m);
            System.out.format("Total: $%.2f",2.00*m);
        }
        else if (n == 5) {
            System.out.println("Item: Soda");
            System.out.println("Quantity: "+m);
            System.out.format("Total: $%.2f",1.50*m);
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
