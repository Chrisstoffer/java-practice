import java.util.*;
public class mathmetho {
    public static void main(String[] args) {
        
    
    Scanner take = new Scanner (System.in);
    System.out.println("Enter your numbers to compare : ");
    int num1 = take.nextInt();
    int num2 = take.nextInt();
    int maxi= Math.max(num1, num2);             // to find the maximum value between two intigers, দুইটা পূর্ণ সংখ্যার মধ্যে বড় ভ্যালু বের করার জন্য মেথড
    int mini= Math.min(num1, num2);            // to find the minimum value between two intigers, দুইটা পূর্ণ সংখ্যার ছোট ভ্যালু বের করার জন্য মেথড
 System.out.println("Maximum: "+ maxi);     
 System.out.println("Minimum: "+mini);    
 double power= Math.pow(maxi, 5.0);                 //to find the exponential of a number, একটি সংখ্যার সূচকীয় মান বের করার মেথড
 System.out.println("Exponential: "+power);
 double sqroot = Math.sqrt(6.25);                   //to find the square root of a number, একটি সংখ্যার বর্গমূল বের করার মেথড
 System.out.println("Square root: "+sqroot);
 double cuberoot = Math.cbrt(15.6252);      //to find the qube root of a number, একটি সংখ্যার ঘনমূল বের করার মেথড 
 System.out.println("Cube root: "+cuberoot);
}

}