import java.util.Scanner;

public class Ans_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        int arr[] = new int [n] ;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 1) {
                arr[i] = 1 ;
            }
            else {
                arr[i] = 0 ;
            }
        }
        System.out.println("After modifying: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
