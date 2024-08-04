public class Ans_07 {
    public static void main(String[] args) {
        int minute = 3456789 ;
        int  days= (minute / 60 / 24) % 365 ;
        int  years= minute / (1440*365) ;
        System.out.println(minute + " minutes is approximately " + years + " years and " + days + " days"); ;
    }
}
