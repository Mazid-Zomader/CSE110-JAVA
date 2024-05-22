import java.util.Scanner ;
public class Assignment_04_HW05{
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter: ") ;
    int num1 = sc.nextInt();
    int num = num1 ;
    int count = 0 ;
    while ( num != 0 ) {
      count += 1 ;
      num /= 10 ;
    }
//    System.out.println("Total digits = " +count);
    int div = 1 ;
    for (int i = 1 ; i < count ; i++) {
      div *= 10 ;
    }
//    System.out.println(div);
    for (int j = 1 ; j <= count; j++) {
      if (j == count) {
        int a = num1 / div ;
        System.out.print(a) ;
        num1 %= div ;
        div /= 10 ;
      }
      else {
        int a = num1 / div ;
        System.out.print(a + ", ") ;
        num1 %= div ;
        div /= 10 ;
      }
    }
  }
}