import java.util.Scanner;
public class Ans_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total distance travelled: ");
        int distance = sc.nextInt();
        System.out.print("total fuel spent: ") ;
        double fuel = sc.nextDouble();
        double total = distance / fuel;
        System.out.format("%.3f",total );
        System.out.print(" km/l");
    }
}
