import java.util.Scanner;

public class Ans_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the length of array 1: ");
        int length = sc.nextInt();
        System.out.println("Please enter the elements of array 1: ");
        int arr1[] = new int[length] ;
        for (int i = 0 ; i < length ; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Please enter the length of array 2: ");
        length = sc.nextInt();
        System.out.println("Please enter the elements of array 2: ");
        int arr2[] = new int [length] ;
        for (int i = 0 ; i < length ; i++) {
            arr2[i] = sc.nextInt();
        }
        boolean subset = true ;
        for (int i = 0 ; i < arr2.length ; i++) {
            boolean found = false ;
            for (int j = 0 ; j < arr1.length ; j++) {
                if (arr1[j] == arr2[i]) {
                    found = true ;
                    break ;
                }
            }
            if (!found) {
                subset = false ;
                break ;
            }
        }
        if (subset) {
            System.out.println("Array 2 is a subset of Array 1");
        }
        else {
            System.out.println("Array 2 is not a subset of Array 1");
        }
    }
}
