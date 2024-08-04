import java.util.Scanner;
public class Ans_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        int sum = 0 ;
        int count  = 0 ;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter entry no"+ (i+1)+ ": ");
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


        }
        int avg = sum / count ;
        System.out.println("The maximum is " + (int)max);
        System.out.println("The minimum is " + (int) min);
        System.out.println("The average is "  + avg);
    }
}
