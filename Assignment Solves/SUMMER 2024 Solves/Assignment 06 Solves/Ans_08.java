import java.util.Scanner;

public class Ans_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        String s = sc.nextLine();
        String out = "";
        int space_index = 0 ;
        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) == 32) {
                space_index = i;
                break ;
            }
        }
        int i = space_index;
        int j = space_index; ;
        String temp = "";
        for (int k = 0 ; k < space_index; k++) {
            if (k%2 == 0) {
                if ((int) s.charAt(k)>=65 && s.charAt(k)<=90) {
                    out += (char) ((int) s.charAt(k)+32);
                }
                else {
                    out += s.charAt(k);
                }
            }
            else {
                if ((int) s.charAt(k)>=97 && s.charAt(k)<=122) {
                    out += (char) ((int) s.charAt(k)-32);
                }
                else {
                    out += s.charAt(k);
                }
            }
        }
        while (i < s.length()) {
            if (s.charAt(i) == ' ') {
                out += temp+" " ;
                temp = "" ;
                j = 0 ;
            }
            else {
                if (j % 2 == 0) {
                    if ((int) s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                        temp += (char) ((int)s.charAt(i)-32);
                        j += 1 ;
                    }
                    else {
                        if ((int) s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                            temp += s.charAt(i);
                            j += 1 ;
                        }
                        else {
                            temp += s.charAt(i);
                        }

                    }

                }
                else {
                    if ((int) s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                        temp += (char) ((int)s.charAt(i)-32);
                        j+=1 ;
                    }
                    else {
                        if ((int) s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                            temp += s.charAt(i);
                            j+=1 ;
                        }
                        else {
                            temp += s.charAt(i);
                        }
                    }

                }
            }
            i += 1 ;
        }
        out += temp ;
        System.out.println(out);
    }
}
//BRACU . I got some beef with you.
