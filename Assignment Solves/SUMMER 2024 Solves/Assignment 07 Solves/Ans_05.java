import java.util.Scanner;

public class Ans_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter an number: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number to find index: ");
        int ans = sc.nextInt();
        int index = 0 ;
        boolean flag = false;
        while(index < n){
            if (ans == arr[index]){
                flag = true;
                break;
            }
            index += 1 ;
        }
        if (flag){
            System.out.println(ans + " is at index "+index);
        }
        else {
            System.out.println("Element not found");
        }
    }
}
