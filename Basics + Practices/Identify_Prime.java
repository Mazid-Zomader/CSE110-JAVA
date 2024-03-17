import java.util.* ;
public class Identify_Prime {
    public static void  main (String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        boolean isPrime = true ;
        for (int i = 2 ;  i<=a-1 ; i++ ) {
            if ( a% i == 0){
                isPrime = false ;
                break ;
            }
        }
        if (isPrime ){
            System.out.print("Prime");
        }
        else {
            System.out.print("Not Prime");
        }
    }
}
