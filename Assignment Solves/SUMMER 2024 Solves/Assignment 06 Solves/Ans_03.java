import java.util.Scanner;
public class Ans_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        String s = sc.nextLine();
        System.out.print("Enter: ");
        char c = sc.next().charAt(0);
        String out = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                System.out.println(out) ;
                out = "";
            }
            else {
                out += s.charAt(i);
            }
        }
        System.out.println(out);
    }
}
