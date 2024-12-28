package ArrayPrac;

import java.util.Scanner;

public class OUT {
public static void main(String[] args) {
    char a[][]= new char[4][5];
    char k = 97;
   
    for(int row = 0; row<4 ; row++)
    {
        for(int cloumn = 0 ; cloumn<5; cloumn++)
        {
            a[row][cloumn]=k;
            k++;
        }
    }

    for(int row = 0; row<4 ; row++)
    {
        for(int cloumn = 0 ; cloumn<5; cloumn++)
        {
        System.out.print(" "+ a[row][cloumn]);
        }
        System.out.println();
    }
}
}
