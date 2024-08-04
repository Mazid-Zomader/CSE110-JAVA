import java.util.Scanner ;
public class Ans_06{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of terms: ");
        int ent = sc.nextInt();
        int i = 1 ;
        int odd_num = 1 ;
        int odd_sum = 0;
        while (i <= ent) {
            System.out.println(odd_num) ;
            odd_sum += odd_num ;
            i += 1 ;
            odd_num += 2;
        }
        System.out.print("The Sum of odd Natural Numbers up to "+ent+" terms is: " +odd_sum);
    }
}