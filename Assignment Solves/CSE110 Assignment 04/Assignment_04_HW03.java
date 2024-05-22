import java.util.Scanner ;
public class Assignment_04_HW03{
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt() ;
    for (int i = 1 ; i <= num ; i++) {
      if (i%5 == 0){
        if (i%3 != 0){
          System.out.println(i);
        }
      }
    } 
  }
}