public class interpolation {

    public static void main(String[] args) {
        int array[]={5,7,11,14,16,18,20,23,26,27,28,30,31,39,40};
        int value= 23;

        int result = search(array, value);
        if(result==-1)
        {
            System.out.println("Value not found");
        }
        else 
        { 
            System.out.println("Value found at position: "+(result+1));
        }
        
    }
    // This method is created for a interpolation search
    /*You can easly do this if you know binary search, the key difference
     * is , in binary seach we calculate our mid value by deviding the lower and higher value .
     * But here we calculate our mid value using a formula 
     * and the rest is as same as binary search
     */
    private static int search(int[] array, int value) {

    int low=0;                // this is our lower index value
    int high=array.length-1;        //this is higher index value 
    while(low<=high && value>=array[low] && value <= array[high])   //while loop with 3 conditin 
    {
        //calculating the index vlaue or you can say mid value
        int index= low + (value - array[low]) * (high - low) / (array[high] - array[low]);

if(array[index]== value)    //here is our first condition  
{
    return index;       //if our value matches our value it will return our index value
}
else if (array[index]>value)    //our second condition 
{
    high=array[index]-1;
}
else // and the last 
{
    low=array[index]+1;
}

    }
    return -1;  //if not found , it will  return -1 
        
    }
    
    //সবাই কোড করতে বসো।
    
}
