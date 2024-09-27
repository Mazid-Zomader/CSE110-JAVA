import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        boolean check = isPrime(7);
        System.out.println(check);
        boolean check1 = isPrime(15);
        System.out.println(check1);
    }
    //    (a)
    public static boolean isPrime(int n){
        for (int i = 2 ; i < n ; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

}