import java.util.Scanner;

public class Ans_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();
        int arr[] = new int[length] ;
        for (int i = 0 ; i < length ; i++) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            arr[i] = number;
        }
        System.out.println("Original array: ");
        for (int i = 0; i < length ; i++) {
            System.out.print(arr[i] + " ");
        }
//        (a)
        int new_arr[] = new int [length] ;
        for (int i = length - 1 ; i >= 0 ; i--) {
            new_arr[i] = arr[length-1-i];
        }
        System.out.println();
        System.out.println("Reversing using a new array: ");
        for (int i = 0 ; i < new_arr.length ; i++) {
            System.out.print(new_arr[i] + " ");
        }
//        (b)
        for (int i = 0 ; i < arr.length/2 ; i++) {
            int temp = arr[arr.length-1-i];
            arr[arr.length -1 - i] = arr [i] ;
            arr[i] = temp ;
        }
        System.out.println();
        System.out.println("Reversing the original array: ");
        for (int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
