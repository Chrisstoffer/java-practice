package ArrayPrac;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortaccende {
public static void main(String[] args) {
    int num[] = {1,2,5,3,10,4,7,9,6,8};
    Arrays.sort(num);
    for(int i=0;i<num.length;i++)
    {
        System.out.print(num[i]+"   ");
    }
    System.out.println();

    for(int i=9;i>=0;i--)
    {
        System.out.print(num[i]+"   ");
    }
}
}

