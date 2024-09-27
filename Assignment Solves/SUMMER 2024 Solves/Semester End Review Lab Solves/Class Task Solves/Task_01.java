public class Task_01 {
    public static void main(String[] args) {
        evenChecker(10);
        evenChecker(17);
        boolean result = isEven(10);
        System.out.println( result );
        boolean result1 = isEven(17);
        System.out.println( result1 );
        boolean result2 = isPos(-5);
        System.out.println( result2 );
        boolean result3 = isPos(12);
        System.out.println( result3 );
        sequence(10);

        sequence(-7);
        sequence(7);
        sequence(-8);




    }
//    (a)
    public static void evenChecker(int num){
        if (num % 2 == 0){
            System.out.println("Even!!");
        }
        else {
            System.out.println("Odd!!");
        }
    }
//    (b)
    public static boolean isEven(int num){
        if (num % 2 == 0){
            return true;
        }
        return false;
    }
//    (c)
    public static boolean isPos(int num){
        if (num < 0){
            return false;
        }
        return true;
    }
//    (d)
public static void sequence(int n) {
    if (isPos(n)) {
        int temp = 0;
        if (isEven(n)) {
            while (temp <= n) {
                System.out.print(temp + " ");
                temp += 2;
            }
        }
        else {
            while (temp < n) {
                System.out.print(temp + " ");
                temp += 2;
            }
        }
    }
    else {
        if (isEven(n)) {
            n += 1 ;
        }
        while(n <= -1){
            System.out.print(n + " ");
            n += 2;
        }
    }
    System.out.println();
    }
}
