public class _12_String_Methods {
  public static void main(String[] args) {
    String name = "Divya";
    System.out.println(name);
    System.out.println("Length of String : " + name.length());
    System.out.println("LowerCase : " + name.toLowerCase());
    System.out.println("UpperCase : " + name.toUpperCase());
    String name2 = "      Divya      is a ";   //non trimmed string
    System.out.println("Untrimmed String : " + name2);
    System.out.println("Trimmedd String : " + name2.trim());
    System.out.println("SubString from specific Index : " + name.substring(2));
    System.out.println("SubString from 0 Index : " + name.substring(0)); //redundant bcoz we can write the string itself instead of index 0
    System.out.println("SubString between two indices : " + name.substring(1, 5));
    System.out.println("Replacing Characters in String : " + name.replace('D','p'));
    System.out.println("Replacing SubString : " + name.replace("Div","Hey"));
    System.out.println("Checking whether String StartsWith the given String Or not : " + name.startsWith("Di"));
    System.out.println("Checking whether String EndsWith the given String Or not : " + name.endsWith("Di"));
    System.out.println("The Character at given index : " + name.charAt(2));
    System.out.println("The Index at a given Character : " +name.indexOf('v'));
    System.out.println("The Index of the String from given index : " + name.indexOf("a",3));  // here a maybe String
    String name3 = "Divyavyavya";
    System.out.println("Last Index of the given character : " + name3.lastIndexOf("v"));
    System.out.println("last index of the given string from given index : " + name3.lastIndexOf("vya", 7));
    System.out.println("Checking whether String is equals to the given String Or not : " + name.equals("divya"));     //Strings are case sensitive in java
    System.out.println("Checking whether String is equal to the given String Or not by ignoring the lower and upper cases : " + name.equalsIgnoreCase("divya"));     // ignore lower or upper case
  }
}
