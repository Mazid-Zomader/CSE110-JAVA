import java.util.Scanner;
public class Ans_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ") ;
        String s = sc.nextLine();
        String out = "";
        for (int i = 0; i < s.length(); i++) {
            if ((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 122 ){
                out += (char)(((int)s.charAt(i))-32);
            }
            else {
                out += s.charAt(i);
            }
        }
        System.out.println(out);
    }
}
