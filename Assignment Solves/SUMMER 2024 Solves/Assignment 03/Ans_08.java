import java.util.Scanner ;
public class Ans_08 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter id: ") ;
        int id = sc.nextInt() ;
        int mod_id = (int) id/100000 ;
//    System.out.println(mod_id);
        int year = (int) mod_id/10 ;
//    System.out.println(year);
        int semester = (int) mod_id % 10 ;
//    System.out.print(semester) ;

        if (semester == 1) {
            System.out.print("Student joined BRAC in Spring "+year) ;
        }
        else if (semester == 2) {
            System.out.print("Student joined BRAC in Fall "+ year) ;
        }
        else {
            System.out.print("Student joined BRAC in Summer "+ year) ;
        }
    }
}