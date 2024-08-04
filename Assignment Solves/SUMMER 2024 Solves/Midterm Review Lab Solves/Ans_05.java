import java.util.Scanner;
public class Ans_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting: ");
        int start = sc.nextInt();
        System.out.print("Enter Change: ");
        int change = sc.nextInt();
        System.out.print("Enter Ending: ");
        int ending = sc.nextInt();
        while (start <= ending) {
            if (start + change >= ending) {
                System.out.print(start);
            }
            else {
                System.out.print(start+", ") ;
            }
            start += change ;
        }
    }
}
