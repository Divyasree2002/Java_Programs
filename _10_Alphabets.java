public class _10_Alphabets{
  public static void main(String[] args) {
    char ch  = 'a';
    for(int i=ch ;i<= 'z';i++){
        System.out.print(ch+" , ");
        ch++;
    }
    System.out.println();
    char ch1  = 'A';
    for(int i=ch1 ;i<= 'Z';i++){
        System.out.print(ch1+" , ");
        ch1++;
    }
    System.out.println();
  //encryption of data 
    char grade = 'B';
    grade = (char)(grade + 8);
    System.out.println(grade);

  //Decryption of data
    grade = (char)(grade - 8);
    System.out.println(grade);
  }
}