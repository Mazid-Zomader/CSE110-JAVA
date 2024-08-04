import java.util.Scanner ;
public class Ans_08 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt() ;
        for (int i = 1 ; i <= num ; i++) {
            if (i%5 == 0){
                if (i%3 != 0){
                    System.out.println(i);
                }
            }
        }
    }
}