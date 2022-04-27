import java.util.Scanner;

public class _11_Strings {
  public static void main(String[] args) {
    //String is a class in java,we can use string as primitive data type
    Scanner sc = new Scanner(System.in);
    String name = new String("Divya is a good girl");   // as a class
    String str = "Aakash";      //as a data type
    System.out.println(name);
    System.out.println(str);
    System.out.printf("%s\n",name);   //%s,%d,%c,%f are format specifiers
    System.out.format("%s\n",str);
    String str2 = sc.nextLine();
    String str1 = sc.next();
    System.out.println(str1 + "\n" + str2);


    //Practice question 1
    String letter;
    letter = "Dear <|name|> , Thanks a lot";
    System.out.println("\n" + letter.replace("<|name|>","Divya")+ "\n");

    //practice question 2
    String string = "Hey divya  ! how are  you   man!";
    if(string.indexOf("  ") != -1)
      System.out.println("Double spaces are there");
    else
      System.out.println("No Double spaces");
    
  
    if(string.indexOf("   ") != -1)
      System.out.println("triple spaces are there!");
    else
      System.out.println("No triple spaces ");
    
    sc.close();
  }
}
