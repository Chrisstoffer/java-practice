package ArrayPrac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraylist3 {
public static void main(String[] args) {
    ArrayList<Integer> number = new ArrayList<>();
    number.add(2);
    number.add(10);
    number.add(4);
    number.add(9);
    number.add(3);
    number.add(5);
    number.add(7);
    number.add(6);

    System.out.println("Size of the array: "+ number.size());

    System.out.println("Array before sorting : "+ number);

    Collections.sort(number);
    System.out.println("Ascending sorting : "+number);
    //Collections.reverse(number);
    //System.out.println("Descending Sorting: "+number);
    //Collections.shuffle(number);
    //System.out.println("Shuffeled numbers :"+number);
    //Collections.binarySearch(number, 8);
    System.out.println("vlaue 8 : "+(Collections.binarySearch(number, 7)));
}
}
