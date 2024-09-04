import java.util.Scanner;
public class Ans_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start: ") ;
        int start = sc.nextInt();
        System.out.print("Stop: ") ;
        int stop = sc.nextInt();
        for (int i = start; i <= stop; i++) {
            boolean check = Armstrong(i) ;
            if (check) {
                System.out.println(i) ;
            }
        }
    }
    public static boolean Armstrong(int n) {
        boolean isArmstrong = false ;
        int n1 = n ;
        int n2 = n ;
        int count = 0 ;
        while (n != 0) {
            count  += 1 ;
            n /= 10 ;
        }
        int sum  = 0 ;
        int power = (int) Math.pow(10, count-1);
        while (n1 != 0) {
            sum += (int) Math.pow((n1/power),count) ;
            n1 %= power ;
            power /= 10;
        }
        if (sum == n2) {
            isArmstrong = true ;
            return isArmstrong ;
        }
        return isArmstrong ;
    }
}
