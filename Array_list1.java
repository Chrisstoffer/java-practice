package ArrayPrac;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list1 {
public static void main(String[] args) {

    //declaring arraylist 

    ArrayList<Integer> number = new ArrayList<>();

    //adding value in arrraylist 
    number.add(10);
    number.add(15);
    number.add(20);
    number.add(25);
    System.out.println("SIze of the arraylist : "+number.size());

    System.out.println(number);

    //for(int x : number)
    //{
     //   System.out.print(" "+x);
    //}

    //showing element using iterator 
    Iterator itr = number.iterator();
    System.out.println("The arraylist : ");
    while (itr.hasNext()) {
        System.out.print("  "+itr.next());
        
    }
    System.out.println();

    //checking if a vlaue in present or  not ?
    System.out.println("is 20 present: "+number.contains(20));
    System.out.println("Index of 20: "+number.indexOf(20));

    //for remove 
    number.remove(1);
    System.out.print("After removing from index 1: "+number);
    System.out.println();




    //remove all 
    //can also be done by .clear();
    //number.clear();
    number.removeAll(number);
    System.out.println("After removing all ");
    System.out.println(number);

    System.out.println("Is it empty: "+number.isEmpty());

//.set(index, vlaue )   replace a already existed method
//.get(index)  to a element from this index 

    
}
}
