import java.util.Scanner;

public class _13_if_Else {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your age");
    int age = sc.nextInt();
    if(age>=18){
      System.out.println("Hey! you can watch all videos on youtube");
    }
    else{
      System.out.println("Hey! Your channel is under parental control");
    }
    sc.close();
  }
}
