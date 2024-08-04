public class Ans_14 {
    public static void main(String[] args) {
        int a = 8, b = 3 ;
        int side =(int) Math.sqrt(((a/2)*(a/2))+(b*b));
        System.out.println(side);
        double area = ((3*Math.sqrt(3))/2)* (Math.pow(side,2));
        System.out.println("Area of hexagon is " +String.format("%.3f", area));
        double circum = 6*side ;
        System.out.println("Circumference of hexagon is " + (int)circum);
        System.out.format("The Circumference of hexagon is %.1f", circum);
    }
}
