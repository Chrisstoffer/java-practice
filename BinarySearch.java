
import java.util.*;
public class BinarySearch
{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
System.out.print("Enter the size of an array: ");
int size = input.nextInt();
int array []=new int[size];
System.out.println("Enter an array of size "+size);
for(int i=0;i<size;i++)
{
    array[i]=input.nextInt();
}
int left=0;
int right= (array.length -1);
System.out.println("Enter your value to search : ");
int x = input.nextInt();
int result=-1;
while(left<=right)
{

int mid = (left+right)/2;

if(array[mid]==x)
{
    result= mid;
    break;
}
else if (array[mid]>x)
{
    right=mid-1;

}
else {
    left=mid+1;
}

}
System.out.println("Your array is : ");
for(int i = 0; i<size ; i++)
{

    System.out.print("\t"+array[i]);
}
System.out.println("\n");
if(result != -1)
{
    System.out.println("Your value is at index : "+result);
}
else {
    System.out.println("Result not found");
}






}



}