import java.util.Scanner ;
public class Ans_05{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int neg_num = 0 ;
        int pos_num = 0 ;
        for (int i = 1 ; i <= num ; i++) {
            System.out.print("Enter number "+i+": ");
            int inp = sc.nextInt();
            if (inp < 0) {
                neg_num += 1 ;
            }
            else {
                pos_num += 1 ;
            }
        }
        System.out.println(pos_num+" Non-negative Numbers");
        System.out.print(neg_num + " Negative Numbers");
    }
}