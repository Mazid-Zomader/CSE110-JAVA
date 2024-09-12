import java.util.Scanner;
public class Ans_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        String s = sc.nextLine();
        boolean flag = true ;
        int i = 0 ;
        int j = s.length() - 1 ;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = false ;
                break ;
            }
            i+= 1 ;
            j-= 1 ;
        }
        System.out.println(flag);
    }
}
