package ArrayPrac;

import java.util.Scanner;

public class TwoD {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a[][] = new int[2][2];
    int b[][] = new int[2][2];

    System.out.println("enter vlaue for A : ");

    for(int i = 0; i<2;i++)
    {
        for(int j = 0 ; j<2;j++)
        {
            a[i][j]=input.nextInt();
        }
    }

    System.out.println("enter vlaue for B : ");


    for(int i = 0; i<2;i++)
    {
        for(int j = 0 ; j<2;j++)
        {
            b[i][j]=input.nextInt();
        }
    }

    System.out.println("A :");

    for(int i = 0 ; i<2; i++)
    {
        for (int j = 0; j<2;j++)
        {
            System.out.print(" "+a[i][j]);
        }
        System.out.println();
    }


    System.out.println("B :");


    for(int i = 0 ; i<2; i++)
    {
        for (int j = 0; j<2;j++)
        {
            System.out.print(" "+b[i][j]);
        }
        System.out.println();
    }

    int c[][] = new int[2][2];


    System.out.println("A+B :");

    for(int i = 0 ; i<2; i++)
    {
        for (int j = 0; j<2;j++)
        {
            c[i][j]=a[i][j]+b[i][j];
            
            System.out.print("    "+c[i][j]);
        }
        System.out.println();
    }
    
}
}
