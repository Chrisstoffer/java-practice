package ArrayPrac;

import java.util.ArrayList;

public class arra_list2 {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(5);
        num1.add(10);
        num1.add(15);
        num1.add(20);
        System.out.println("Number 1: "+num1);

        ArrayList<Integer> num2 =  new ArrayList<>();
        num2.add(25);
        num2.add(30);
        num2.add(35);
        num2.add(40);
        System.out.println("Number 2: "+num2);

        ArrayList<Integer> num3 = new ArrayList<>();
      num3.addAll(num1);
      System.out.println("Number 3: "+num3);


      System.out.println("numer 1 = number 3? "+ num1.equals(num3));
    }

}
