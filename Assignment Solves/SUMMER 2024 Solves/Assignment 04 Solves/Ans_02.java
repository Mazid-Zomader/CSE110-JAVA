import java.util.Scanner ;
public class Ans_02{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of entries: ");
        int N = sc.nextInt();
        int maxVal = 0 ;
        int sum = 0 ;
        for (int i = 1; i <= N ; i++) {
            System.out.print("Enter no "+ i + " entry: ");
            int a = sc.nextInt();
            sum += a ;
            if (a > maxVal){
                maxVal = a ;
            }
            else {
            }
        }
        System.out.println("The sum of "+ N +" no is: "+sum);
        sum /= N;
        float a = (float) sum;
        System.out.print("The average is: "+ a);
    }
}