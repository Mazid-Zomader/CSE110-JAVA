public class Ans_13 {
    public static void main(String[] args) {
        int meter = 2500 ; // Last 4 digit of ID
        double total_hour = 5 + (56/60.0) + (23/3600.0) ;
        double km_hour = (meter / 1000.0) /total_hour ;
        double mile_hour = (meter / 1609.0) / total_hour ;
        System.out.println(km_hour);
        System.out.println(mile_hour);
    }
}

