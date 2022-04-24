import java.util.Scanner;

public class _07_integer_or_not {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number : ");
    System.out.println(sc.hasNextInt());
    sc.close();
  }
}
