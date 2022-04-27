import java.util.Scanner;

public class _07_integer_or_not {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number : ");
    System.out.println(sc.hasNextInt());
    System.out.println("checking whether given number is greater or not with user input");
    int a = 30;
   // int b =sc.nextInt
    System.out.println(a>sc.nextInt());
  
    sc.close();
  }
}
