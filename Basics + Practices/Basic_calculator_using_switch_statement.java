import java.util.* ;
public class Basic_calculator_using_switch_statement {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println("Calculation(+,-,*,/)");
        System.out.print("Enter required calculation: ");
        String sign2 = sc.next();
        switch (sign2) {
            case "+" :
                int sresult = num1+num2 ;
                System.out.print("The sum of"+" "+ num1+" "+"&"+" "+num2+" "+"is"+" "+sresult);
                break ;
            case "-" :
                int dresult = num1-num2 ;
                System.out.print("The difference of"+" "+ num1+" "+"&"+" "+num2+" "+"is"+" "+dresult);
                break ;
            case "*" :
                int presult = num1*num2 ;
                System.out.print("The sum of"+" "+ num1+" "+"&"+" "+num2+" "+"is"+" "+presult);
                break ;
            case "/" :
                int qresult = num1/num2 ;
                System.out.print("The sum of"+" "+ num1+" "+"&"+" "+num2+" "+"is"+" "+qresult);
                break ;
            default:
                System.out.print("The system can not handle your calculation \uD83E\uDD79");
        }
    }
}
