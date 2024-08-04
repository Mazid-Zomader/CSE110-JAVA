import java.util.Scanner;
public class Ans_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter inch to convert to meter: ");
        int inch = sc.nextInt(); ;
        System.out.println(inch+ " inch is " + inch*0.0254+ " meter " );
    }
}
