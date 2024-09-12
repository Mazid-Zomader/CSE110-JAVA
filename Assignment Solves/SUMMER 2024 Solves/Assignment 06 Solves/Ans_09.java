import java.util.Scanner;

public class Ans_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass= sc.nextLine();
        boolean upper = false ;
        boolean lower = false ;
        boolean number = false ;
        boolean character = false ;
        if (pass.length() < 8) {
            System.out.println("False");
        }
        else {
            for (int i = 0; i < pass.length(); i++) {
                if ((int) pass.charAt(i) >= 65 && (int) pass.charAt(i) <= 90) {
                    upper = true;

                }
                else if ((int) pass.charAt(i) >= 97 && (int) pass.charAt(i) <= 122) {
                    lower = true;
                }
                else if ((int) pass.charAt(i) >= 48 && (int) pass.charAt(i) <= 57) {
                    number = true;

                }
                else if ((int) pass.charAt(i) == 33 || (int) pass.charAt(i) == 35 || (int) pass.charAt(i) == 36 || (int) pass.charAt(i) == 64) {
                    character = true;
                }
            }
            if (upper && lower && number && character) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }

}
