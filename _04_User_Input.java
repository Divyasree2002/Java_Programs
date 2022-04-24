import java.util.Scanner;
public class _04_User_Input {
  public static void main(String[] args) {
     System.out.println("Taking input ");
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your name");
    String name = sc.nextLine();
    System.out.println("Hello " + name);
    String str = sc.nextLine();
    System.out.println("the str is : " + str);
    System.out.println("enter a number");
    int a = sc.nextInt();
    System.out.println("The number is : " + a);  
    sc.close();


  }
}
