import java.util.Scanner;
public class Ans_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        String n = sc.nextLine();
        int vowel = 0 ;
        int consonant = 0 ;
        for (int i = 0; i < n.length(); i++) {
            if (((int) n.charAt(i) >= 65 && (int) n.charAt(i) <= 90) || ((int) n.charAt(i) >= 97 && (int) n.charAt(i) <= 122)) {
                if ((int) n.charAt(i) == 65 || (int) n.charAt(i) == 69 || (int) n.charAt(i) == 73|| (int) n.charAt(i) == 79|| (int) n.charAt(i) == 85|| (int) n.charAt(i) == 97|| (int) n.charAt(i) == 101|| (int) n.charAt(i) == 105|| (int) n.charAt(i) == 111|| (int) n.charAt(i) == 117 ){
                        vowel += 1 ;
                }
                else {
                    consonant += 1 ;
                }
            }
        }
        if (vowel > 0 && consonant > 0 ) {
            if (vowel%3 == 0 && consonant%5 == 0) {
                System.out.println("Aaarr! Me Plunder!!");
            }
            else {
                System.out.println("Blimey! No Plunder!!");
            }
        }
        else {
            System.out.println("Blimey! No Plunder!!");
        }
    }
}
