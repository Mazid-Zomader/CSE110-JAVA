public class Task_04 {
    public static void main(String[] args) {
        boolean check2 = isPerfect(6);
        System.out.println(check2);
        boolean check3 = isPerfect(33);
        System.out.println(check3);
    }
    public static boolean isPerfect(int n){
        int sum = 0;
        for (int i = 1; i < n ; i++){
            if (n % i == 0){
                sum += i;
            }
        }
        if (sum == n){
            return true;
        }return  false;
    }
}