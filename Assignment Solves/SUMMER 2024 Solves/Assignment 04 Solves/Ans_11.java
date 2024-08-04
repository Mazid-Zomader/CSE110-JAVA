import java.util.Scanner ;
public class Ans_11{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ") ;
        int num = sc.nextInt();
        int sum = 1 ;
        boolean prime = true ;
        for (int i = 2 ; i < num ; i++) {
            if (num % i == 0 ) {
//        System.out.println(i);
                sum += i ;
                prime = false ;
            }
        }
        if (prime){
            System.out.println(num+ " is a prime number.");
        }
        else {
            System.out.println(num+ " is not a prime number.");
        }
        if (sum == num) {
            System.out.println(num+ " is a perfect number.");
        }
        else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
    