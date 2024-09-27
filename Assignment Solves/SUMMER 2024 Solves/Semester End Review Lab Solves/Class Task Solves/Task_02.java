import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        double area = circleArea(5);
        System.out.println(area);
        double volume = sphereVolume(5);
        System.out.println(volume);
        findSpace(10,"circle");
        findSpace(10,"sphere");
        findSpace(10,"square");
    }

//    (a)
    public static double circleArea ( int n){
        return Math.PI * Math.pow(n, 2);
    }
//    (b)
    public static double sphereVolume ( double radius){
        return (4 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
//    (c)
    public static void findSpace ( int n, String ans){
        if (ans.equals("circle")) {
            System.out.println(circleArea(n / 2));
        }
        else if (ans.equals("sphere")) {
            System.out.println(sphereVolume(n / 2));
        }
        else {
            System.out.println("Wrong parameter");
        }
    }
}