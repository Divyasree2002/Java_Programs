public class _08_Operators {
  public static void main(String[] args) {
    //Operators - arithmetic,assignment,camparision,logical,bitwise
    //arithmetic - +,-,*,/,%
    //assignment - =,+=,-=,*=,%=./=
    //comparision - ==,>=,<=,<,>,!=,<=
    //logical = &&,||,!
    //bitwise - &,|,!

    //According tp highest precedence(in terms of symbols) and associativity(in terms of left to right) 
    //((),[],.,->)(left to right) , 
    //(!,~(ones complement) (-(unary minus)) (++) (--) (&(address)) ((type) cast) (sizeof) (right to left) , 
    //(*,/,%) (+,-) (<<,>>) (<,<=,>,>=) (==,!=) (&(bitwise AND)) (^(Bitwise XOR)) (|(Bit-OR)) 
    //(&&(logi-AND)) (||(logi-OR)) (left to right)
    //(? :(conditional)) (=,+=,*=,/=,-=,%=) (Right to left)
    //(,(comma)) (left to right)
    int a = 40/5 - 3*2;
    int b = 6,c= 4;
    System.out.println(a);
    System.out.println((b*b-4*a*c)/(2*a));
    System.out.println(a++);
    System.out.println(++a);
    System.out.println(b--);
    System.out.println(--b);
    float d = (float)7/4*9/2; //type casting
    System.out.println(d);
  }
}
