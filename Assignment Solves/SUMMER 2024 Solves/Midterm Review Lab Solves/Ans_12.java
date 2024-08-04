import java.util.Scanner;
public class Ans_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        int sum = 0 ;
        int count  = 0 ;
        boolean flag = true ;
        while (flag) {
            System.out.print("Enter inputs: ");
            int a = sc.nextInt();
            if (a %2 == 0  && a > 0){
                sum += a ;
                count   += 1 ;
                if (a > max) {
                    max = a ;
                }
                if (a < min) {
                    min = a ;
                }
            }
            else if (a == 0) {
                flag = false ;
            }


        }
        System.out.println("The maximum is " + (int)max);
        System.out.println("The minimum is " + (int) min);
        if (sum == 0) {
            int avg = 0 ;
            System.out.println("The average is "  + avg);
        }
        else {
            int avg = sum / count ;
            System.out.println("The average: "  + avg);
        }
    }
}
