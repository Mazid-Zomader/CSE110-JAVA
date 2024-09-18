public class Ans_07 {
    public static void main(String[] args) {
        int arr [] = {-5,10,-7,-5};
        System.out.println("Input array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int new_arr[] = new int[arr.length] ;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true ;
            for (int j = 0; j < new_arr.length; j++) {
                if (arr[i] == new_arr[j]) {
                    flag = false;
                    break ;
                }
            }
            if (flag) {
                new_arr[i] = arr[i] ;
                count += 1 ;
            }
        }
        System.out.println();
        System.out.println("New array:");
        int output[] = new int[count] ;
        count = 0;
        for (int i = 0; i < new_arr.length; i++) {
            if (new_arr[i] != 0) {
                output[count] = new_arr[i];
                count += 1 ;
            }
        }
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }
    }
}
