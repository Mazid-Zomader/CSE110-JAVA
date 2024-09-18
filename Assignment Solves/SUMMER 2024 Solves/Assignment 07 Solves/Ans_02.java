import java.util.Scanner;
public class Ans_02 {
    public static void main(String[] args) {
        int arr [] = {9, -5, 7, 9, -5, 5, 7};
        int new_arr[] = new int[arr.length] ;
        System.out.println("Before replacing duplicates with 0: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < new_arr.length; i++) {
            boolean flag = true ;
            for (int j = 0; j < new_arr.length; j++) {
                if (new_arr[j] == arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                new_arr[i] = arr[i];
            }
        }
        System.out.println();
        System.out.println("After replacing duplicates with 0: ");
        for (int i = 0; i < new_arr.length; i++) {
            System.out.print(new_arr[i] + " ");
        }

    }
}
