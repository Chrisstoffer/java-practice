package ArrayPrac;

import java.util.*;

public class Array_f {
    public static void main(String[] args) {

        int a[] = new int[10];
        Scanner input = new Scanner(System.in);
        
        int sum=0;

        for(int i =0;i<10;i++)
        {
            a[i]=input.nextInt();

            sum += a[i];

        }

        System.out.println("sum of the array : "+sum);

        for(int i=0;i<10;i++)
        {
            System.out.print(a[i]+" ");
        }

        System.out.println();

        double size = a.length;

        System.out.println(size);

        System.out.println("Average of the array : "+sum/size);

        int max = a[0];

        for(int i =1; i<10; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }

        System.out.println("max value is : "+max);

        int min = a[0];
        
        for(int i=1;i<10;i++)
        {
            if(min > a[i])
            {
                min = a[i];
            }
        }
        System.out.println("min is : "+min);


    }

}
