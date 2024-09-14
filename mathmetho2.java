import java.util.*;
public class mathmetho2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Round method
        /*একটা ফ্রাকশনাল সংখ্যাকে পূর্ণ সংখ্যায় রূন্তর করার জন্য Math.round() মেথড ব্যাবাহার করা হয়।
        যদি সংখ্যাটির দশমিকের পরে ৫ এর বেশি হয় তাহলে এটি উপরের বড় সংখ্যায় পরিবর্তন করবে (১৭.৫১ -- ১৮.০)
        যদি ৫ এর নিচে হয় তাহলে নিচের ভ্যালুতে পরিবর্তন করবে (১৭.৪৯ -- ১৭.০)।
        এটি একটু লং টাইপ ভ্যালু রিটার্ন করে । ডাবল ---> লং
         */
        System.out.println("Enter a fractional vlaue: ");
        float num1 = input.nextFloat();
        double round = Math.round(num1);
        System.out.println("Round: "+round);


        // Celling method 
        /*ceil মেথড সব সময় একটি সংখ্যার সর্বোচ্চ সীমায় রূপান্তর করবে (১৭.৫২ -- ১৮.০, ১৭.২২ -- ১৮.০)
        এটি একটি ডাবল টাইপ ভ্যালু রিটার্ন করে
         */
        double Celling = Math.ceil(num1);
        System.out.println("Celling: "+Celling);

        //floor method
        /*floor  মেথড সব সময় একটি সংখ্যার নিম্নসীমায় রূপান্তর করে (১৭.৫২ --১৭.০, ১৭.৯৮ --১৭)  
         * এটি একটি ডাবল টাইপ ভালু রিটার্ন করে
        */
        double floor = Math.floor(num1);
        System.out.println("floor: "+floor);
    }
}
