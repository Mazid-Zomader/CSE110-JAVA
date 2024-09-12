import java.util.Scanner;

public class Ans_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        String s = sc.nextLine();
        System.out.print("Enter: ");
        String t = sc.nextLine();
        String out = "";
        for (int i = 0; i < s.length(); i++) {
            boolean flag = true ;
            for (int j = 0; j < t.length(); j++) {
                if (s.charAt(i) != t.charAt(j)) {
                    flag = true;
                }
                else{
                    flag = false;
                    break;
                }
            }
            if (flag) {
                out += (char)(((int)s.charAt(i))-32);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            boolean flag = true ;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != t.charAt(i)) { // checking availability
                    flag = true;
                }
                else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                out += (char)(((int)t.charAt(i))-32);
            }
        }
        System.out.println(out);
    }
}
