import java.util.Scanner ;
public class Ans_09{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int num = sc.nextInt() ;
        int count = 0 ;
        while ( num != 0 ) {
            count += 1 ;
            num /= 10 ;
        }
        System.out.print("Total digits = " +count);
    }
}