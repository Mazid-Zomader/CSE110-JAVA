import java.util.Scanner;
public class Ans_04 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of test cases: ");
        int a = sc.nextInt();
        for (int i = 0; i < a ; i++){
            int sum = 0 ;
            System.out.print("Start: ");
            int start = sc.nextInt();
            System.out.print("Number of Odd Numbers: ");
            int odd = sc.nextInt();
            while (odd > 0){
                if (start %2 != 0) {
                    sum += start ;
                    odd -=1;
                }
                start += 1 ;
            }
            System.out.println(sum);
        }

    }
}
