import java.util.Scanner;

public class _05_Percentage {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the total marks");
    float outOf = sc.nextFloat();  //can also be int
    System.out.println("enter your 5 subjects marks");
    float sub1 = sc.nextFloat();
    float sub2 = sc.nextFloat();
    float sub3 = sc.nextFloat();
    float sub4 = sc.nextFloat();
    float sub5 = sc.nextFloat();
    float percentage =( (sub1 + sub2 + sub3 + sub4 + sub5)/(5 * outOf) )* 100;
    float CGPA = percentage/10;
    System.out.println(percentage);
    System.out.println(CGPA);
    sc.close();
  }
}
