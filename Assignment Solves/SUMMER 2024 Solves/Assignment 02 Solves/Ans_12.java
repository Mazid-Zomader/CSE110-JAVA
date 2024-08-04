import java.util.Scanner;
public class Ans_12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your id: ");
        int n = sc.nextInt();
        System.out.println(n%10) ;
        n = n/10 ;
        System.out.println(n%10) ;
    }
}
