public class Ans_06
{
    public static void main (String args[]){
        System.out.println("Creating third variable");
//        Creating third variable
        int a = 5 ;
        int b = 6 ;
        System.out.println("a = "+a+", b = "+b) ;
//        Swapping
        int temp ;
        temp = a ;
        a = b ;
        b = temp ;
        System.out.println("After Swapping:") ;
        System.out.println("a = "+a+", b = "+b) ;
        System.out.println("");
        System.out.println("Without creating any other variable");
//        Without creating any other variable
        int c = 10 ;
        int d = 25 ;
        System.out.println("c = "+c+", d = "+d) ;
        c = c + d ;
        d = c - d ;
        c = c - d ;
        System.out.println("After Swapping:") ;
        System.out.println("c = "+c+", d = "+d) ;
    }
}
