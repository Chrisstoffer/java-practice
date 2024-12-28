package ArrayPrac;

import java.util.Scanner;

public class Mat {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int A[][] = new int[3][3];
    int B[][]= new int[3][3];
    int sum_of_diagonal=0;
    System.out.println("enter the matrix : ");
    for(int row =0;row<3;row++)
    {
        for(int cloumn = 0 ; cloumn < 3 ; cloumn++)
        {
            A[row][cloumn] = input.nextInt();
        }
    } 

    for(int row =0;row<3;row++)
    {
        for(int cloumn = 0 ; cloumn < 3 ; cloumn++)
        {
            if(row==cloumn)
            {
                sum_of_diagonal+=A[row][cloumn];
            }
        }
    } 
    System.out.println("Diagonal : "+ sum_of_diagonal);
}
}
