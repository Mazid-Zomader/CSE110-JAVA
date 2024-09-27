import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        double t = calcTax(16,20000);
        System.out.println(t);
        double t1 = calcTax(20,10000);
        System.out.println(t1);
        System.out.println();
    }
    //    (a)
    public static double calcTax(int age, int salary) {
        if (age < 18 || salary < 10000) {
            return 0.0;
        }
        else if (salary >= 10000 && salary <= 20000) {
            return 0.07*salary;
        }
        else {
            return 0.14*salary;
        }
    }

}