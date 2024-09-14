

// Power and logarithomic methods

import java.util.*;
public class math3 {
   public static void main(String[] args) {
    
Scanner input = new Scanner(System.in);

// base^exp
System.out.print("Enter base and exp: ");
double base = input.nextDouble();
double exp = input.nextDouble();
double res=Math.pow(base,exp);
System.out.println(base+" to the power of "+exp+" is "+res);

// e^base
double Eulers=Math.exp(base);
System.out.println("Euler's e^5.0: "+Eulers);

//log base e, 5.0
double RES=Math.log(base);
System.out.println("log base e of 5.0: "+RES); 

//log base 10 , 5.0
double Log=Math.log10(base);
System.out.println("Log base 10 of 5.0: "+Log);

//squre root of 5.0
double SQRT = Math.sqrt(base);
System.out.println("Squre root of 5.0: "+SQRT);

//cube root of 5.0
double CBRT=Math.cbrt(base);
System.out.println("Cube root of 5.0: "+CBRT);
   } 
}
