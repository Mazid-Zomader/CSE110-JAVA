import java.util.Scanner;
public class Ans_A=03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true ;
        while (flag){
            System.out.print("Enter Number: ");
            int a = sc.nextInt();
            if (a%2 != 0) {
                flag = false ;
            }
            else {
                int count = 1 ;
                for (int i = 1; i < a; i++) {
                    if (a %i == 0){
                        count += 1 ;
                    }

                }
                System.out.println(a+ " has "+count+" divisors") ;
            }
        }
    }
}
