import java.util.Scanner;

public class Ans_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        String s = sc.nextLine();
        String out = "";
        String reverse = "";
        for (int i = s.length() -1 ; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                for (int j = out.length() - 1 ; j >= 0 ; j--) {
                    reverse += out.charAt(j);
                }
                reverse += " ";
                System.out.print(reverse);
                out = "" ;
                reverse = "";
            }
            else {
                out += s.charAt(i);
            }
        }
        for (int j = out.length() - 1 ; j >= 0 ; j--) {
            reverse += out.charAt(j);
        }
        System.out.print(reverse);
    }
}
