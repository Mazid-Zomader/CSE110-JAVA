import java.util.Scanner;

public class Ans_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int length = sc.nextInt();
        double arr []= new double[length];
        double sum = 0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number: ");
            arr[i] = sc.nextDouble();
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println("Maximum element: " + max+" found at index " + maxIndex);
        System.out.println("Minimum element: " + min+" found at index " + minIndex);
        System.out.println("Summation: " + sum);
        System.out.format("Average: %.2f" , sum / arr.length);
    }
}
