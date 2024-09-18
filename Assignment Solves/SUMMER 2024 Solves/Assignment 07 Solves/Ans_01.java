import java.util.Scanner;

public class Ans_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        int arr [] = new int [n] ;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            arr[i] = num;
        }
        int arr2 [] = new int [n+1] ;
        System.out.print("Enter another number: ");
        int num = sc.nextInt();
        System.out.println("The elements in array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ": "+ arr[i]);
        }
        arr2[arr2.length-1] = num;
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        System.out.println("After resizing the array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+ " ");
        }
    }
}
