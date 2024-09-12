import java.util.Scanner;
public class Ans_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        String s = sc.nextLine();
        String out = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            out += s.charAt(i);
        }
        System.out.println(out);
    }
}
