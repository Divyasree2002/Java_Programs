import java.util.Scanner;

public class _06_Kms_Miles {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no of kilometers: ");
    float km = sc.nextFloat();
    float mile = 0.62f * km ;
    System.out.println("the no of miles is : "+ mile);
    sc.close();
  }
}
