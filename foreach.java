package ArrayPrac;

import java.util.Scanner;

public class foreach {
    public static void main(String[] args) {
        String name[]=new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter name one by one : ");
        for(int i = 0; i<4; i++)
        {
            name[i]=input.nextLine();
        }
for(String x: name)
{
    System.out.print("  "+x);
}
        
    }

}
