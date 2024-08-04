// (a)
public class Ans_01{
    public static void main(String [] args){
        int i = 24 ;
        while (i>= -6) {
            if (i == -6) {
                System.out.print(" "+i);
                i -= 6 ;
            }
            else {
                System.out.print(i+" ,");
                i -= 6 ;
            }
        }
        System.out.println();
//    (b)
        int j = -10 ;
        while (j<=20){
            if (j == 20) {
                System.out.print(" "+j);
                j += 5 ;
            }
            else {
                System.out.print(j+" ,");
                j += 5 ;
            }
        }
    }
}